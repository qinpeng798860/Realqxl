package com.zking.real.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.real.system.model.Model;
import com.zking.real.system.model.User;
import com.zking.real.system.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * 中文乱码处理
 */
public class EncodingFilter implements Filter {

    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    private String encoding = "UTF-8";// 默认字符集
    //功能级权限  1、默认过滤的jsp页面 action请求操作 来自于后台数据表T_MOdule
    private List<String> passUrl;


    public EncodingFilter() {
        super();
    }

    public void destroy() {
    }


    public void init(FilterConfig filterConfig) throws ServletException {
        String s = filterConfig.getInitParameter("encoding");// 读取web.xml文件中配置的字符集
        if (null != s && !s.trim().equals("")) {
            this.encoding = s.trim();
        }
        //从数据表t_module中获取所有的公共权限 pid==99代表公共权限
        IModelService iModelService = (IModelService)ac.getBean("modelServiceImpl");
        Model model = new Model();
        model.setrParentCode("99");
        List<Model> models = iModelService.queryModel(model);
        passUrl = new ArrayList<String>();
        //将公共权限提取出来
        for (Model m : models) {
            passUrl.add(m.getrUrl());
        }

    }


    /**
     * 中文乱码处理器
     *
     * @param req
     * @param res
     * @throws IOException
     * @throws ServletException
     */
    public void filterEncoding(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // 中文处理必须放到 chain.doFilter(request, response)方法前面
        res.setContentType("text/html;charset=" + this.encoding);
        if (req.getMethod().equalsIgnoreCase("post")) {
            req.setCharacterEncoding(this.encoding);
        } else {
            Map map = req.getParameterMap();// 保存所有参数名=参数值(数组)的Map集合
            Set set = map.keySet();// 取出所有参数名
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String name = (String) it.next();
                String[] values = (String[]) map.get(name);// 取出参数值[注：参数值为一个数组]
                for (int i = 0; i < values.length; i++) {
                    values[i] = new String(values[i].getBytes("ISO-8859-1"),
                            this.encoding);
                }
            }
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        filterEncoding(req, res);

        HttpSession session = req.getSession();
        ObjectMapper mapper = new ObjectMapper();

        //完整路径
        String reqUrl = null;
        //获取完整的请求路径
        String url = req.getRequestURI();
        //请求路径最后一个斜杠的位置
        int statr = url.lastIndexOf("/");
        //把项目名截取出去 只留下路径
        String actionName = url.substring(5);
        //判断是不是action请求操作
        reqUrl = actionName;
        if(reqUrl.endsWith(".js") || reqUrl.contains(".css")|| reqUrl.endsWith(".jpg") || reqUrl.contains(".png")||reqUrl.contains(".gif")
                ||reqUrl.contains(".ttf") ||reqUrl.contains(".svg") ||reqUrl.contains(".eot")
                ||reqUrl.contains(".woff") ||reqUrl.contains(".woff2")
                ) {
            //寻找下一个链
                chain.doFilter(request, response);
        }else {
            //判断请求路径是否是权限公开部分或jsp页面
            System.out.println("公共路径："+passUrl);
            System.out.println("请求路径："+reqUrl);
            System.out.println("是否是公共的："+passUrl.contains(reqUrl));
                if(passUrl.contains(reqUrl)) {
                //如果用户登陆页面或是用户登录action页面请求 则直接放行
                if(reqUrl.contains("/model/login.shtml") || reqUrl.contains("/model/userLogin") || reqUrl.contains("/model/gotoIndex.shtml")) {
                    //寻找下一个链
                    chain.doFilter(request, response);
                }else {
                    //1、若user对象的session是为空或者是一个新的session 则直接跳转登陆界面
                    //2、若user对象的session不为空 则直接放行
                    if(session.getAttribute("LoginUser")==null ||session.isNew()) {
                        if(reqUrl.contains(".action")) {
                            Map<String, Object> map=new HashMap<String, Object>();
                            map.put("success", false);
                            map.put("message", "登陆超时,请重新登陆");
                            mapper.writeValue(res.getOutputStream(), map);
                        }else {
                            PrintWriter out=response.getWriter();
                            out.println("<html>");
                            out.println("<script>");
                            out.println("window.open('"+req.getContextPath()+"/login.jsp','_top')");
                            out.println("</script>");
                            out.println("</html>");
                            return ;
                        }
                    }else
                        chain.doFilter(request, response);
                 }
            }else {
                //用户超时或没有登陆时跳转登陆页面
                if(session.getAttribute("LoginUser")==null|| session.isNew() ) {
                    if(reqUrl.contains(".action")) {
                        Map<String, Object> map=new HashMap<String,Object>();
                        map.put("success", false);
                        map.put("message", "登陆超时,请重新登陆");
                        mapper.writeValue(res.getOutputStream(), map);
                    }else {
                        PrintWriter out=response.getWriter();
                        out.println("<html>");
                        out.println("<script>");
                        out.println("window.open('"+req.getContextPath()+"/login.jsp','_top')");
                        out.println("</script>");
                        out.println("</html>");
                    }
                    return ;
                }else {
                    //获取session中的user信息
                    User us=(User) session.getAttribute("LoginUser");
                        if(isAccess(reqUrl,us)) {
                        chain.doFilter(request, response);
                    }else {
                        if(!reqUrl.endsWith(".shtml")) {
                            Map<String, Object> map=new HashMap<String, Object>();
                            map.put("code", "-1");
                            map.put("message", "无权限,请联系管理员");
                            mapper.writeValue(res.getOutputStream(), map);
                        }else {
                            PrintWriter out=response.getWriter();
                            request.getRequestDispatcher("/model/error.shtml").forward(request, response);
                            /*res.sendRedirect("/real/model/error.shtml");*/
                        }
                    }
                }
            }
        }
    }




    //判断用户有无权限
    public boolean isAccess(String url,User us) {
        if(us.getrRoleId().equals("22")) {
            return true;
        }
        boolean flag=false;
        for (String str : passUrl) {
            if(str.equals(url)) {
                flag=true;
                break;
            }
        }
        //如果是公共权限直接跳过
        if(flag) {
            return flag;
        }

        List<Model> lst=us.getModelList();
        //遍历用户角色访问模块信息
        //如果匹配成功 则flag=true  证明用户角色有权限
        //如果匹配成功 则flag=false  证明用户角色无权限
        for (Model module : lst) {
            if( null!=module.getrUrl() &&  !module.getrUrl().equals("") && module.getrUrl().equals(url)) {
                flag=true;
                break;
            }
        }
        return flag;
    }

}
