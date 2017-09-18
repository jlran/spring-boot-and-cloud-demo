/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-7 0:47:41
 *
 */

package top.woshare.springbootdemo.config;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HttpAspect {
    
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    
    @Pointcut("execution(public * top.woshare.springbootdemo.*.*(..))")
    public void webLog(){}
    
    @Before("webLog()")
    public void log(JoinPoint joinPoint){
        System.out.println("top.woshare.springbootdemo.config.HttpAspect.log()");
//        记录信息
        logger.info("执行前....");
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
//        url
        logger.info("url={}",request.getRequestURL());
//        method
        logger.info("method={}",request.getMethod());
//        ip
        logger.info("ip={}",request.getRemoteAddr());
//        类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//         参数
        logger.info("args={}",joinPoint.getArgs());
    }
    
    @After("webLog()")
    public void after(){
    }
}
