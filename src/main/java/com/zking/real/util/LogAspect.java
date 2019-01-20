package com.zking.real.util;

import com.zking.real.system.model.SystemLog;
import com.zking.real.system.service.ISystemLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//仅仅表示spring中的一个组件（Bean），可以作用在任何层次
@Aspect//aop功能
public class LogAspect extends AppliUtils{
    @Autowired
    private ISystemLog iSystemLogService;

    private SystemLog systemLog=null;
    /**
     * 日志管理   所有方法 不包括日志层
     * @param args
     * @return
     * @throws Throwable
     */
    @Around("execution(* *..*Service.*(..))")
    public Object incoke(ProceedingJoinPoint args) throws Throwable {
        Object[] args1 = args.getArgs();
        //获取参数
        String params="";
        for (Object o : args1) {
            params+=o;
        }
        systemLog = new SystemLog();

        //id
        systemLog.setLogid(uuidRandom());
        //内容 (执行方法全路径)
        systemLog.setLogpath(args.getTarget().getClass().getName());
        System.out.println(this.SystemnewDate());
        //系统当前时间
        systemLog.setLogdate(this.sysetmDatetime());
        //获取方法名
        systemLog.setLogmethod(args.getSignature().getName());
        //获取参数
        systemLog.setLogparam(params);
        String context="运行成功";
        Object proceed=null;
        try{
             proceed = args.proceed(args1);
        }catch(RuntimeException e){
            context="出现异常 运行失败";
        }
        systemLog.setLogcontext(context);


        int insert = iSystemLogService.insert(systemLog);



        return proceed;
    }



}
