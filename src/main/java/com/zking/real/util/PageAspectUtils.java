package com.zking.real.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//仅仅表示spring中的一个组件（Bean），可以作用在任何层次
@Aspect//aop功能
public class PageAspectUtils {

    @Around("execution(* *..*Service.*Pager(..))")
    public Object incoke(ProceedingJoinPoint args) throws Throwable {
        /*1、获取参数
        * 2、查看方法是否由pagebean
        * 3、通过pagehelper进行内存分页
        * 4、返回数据
        * */
        Object[] params = args.getArgs();
        PageBean bean=null;
        for (Object param: params) {
            if(param instanceof PageBean){
                bean=(PageBean)param;
                break;
            }
        }
        if(null!=bean && bean.isPagination()){
            PageHelper.startPage(bean.getPage(), bean.getRows());

        }

        Object result = args.proceed(params);
        if (null!=bean && bean.isPagination()) {
            List list = (List)result;
            PageInfo pageInfo = new PageInfo(list);
            bean.setTotal(pageInfo.getTotal()+"");/*返回总行数*/

        }
        return result;

    }




}
