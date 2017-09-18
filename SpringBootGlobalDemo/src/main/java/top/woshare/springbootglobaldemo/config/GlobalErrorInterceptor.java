/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-7 12:49:42
 *
 */


/**
 * 全局异常错误的拦截
 */

package top.woshare.springbootglobaldemo.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class GlobalErrorInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
        //请求之前 返回true继续执行  返回false结束
        System.out.println("top.woshare.springbootglobaldemo.config.GlobalErrorInterceptor.preHandle()");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, ModelAndView mav) throws GlobalException {
//       请求处理之后执行
        System.out.println("top.woshare.springbootglobaldemo.config.GlobalErrorInterceptor.postHandle()");
    }

    @Override
    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
        System.out.println("top.woshare.springbootglobaldemo.config.GlobalErrorInterceptor.afterCompletion()");
    }
}
