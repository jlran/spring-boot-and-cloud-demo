/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 23:37:33
 *
 */


package top.woshare.springcloudzuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

/**
 * zuul不仅只是路由，并且还能过滤，做一些安全验证
 * @author Joran
 */

@Component
public class UserFiliter extends ZuulFilter{

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        final HttpServletRequest request = ctx.getRequest();
        /*
        做安全之类的校验
        */
        try {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401); //未授权
            ctx.getResponse().getWriter().write("token is empty"); //不对，返回
        } catch (IOException ex) {
        }
        return null;
    }
}

/*
    filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： 
        pre：路由之前
        routing：路由之时
        post： 路由之后
        error：发送错误调用
        filterOrder：过滤的顺序
        shouldFilter：这里可以写逻辑判断，是否要过滤，为true,永远过滤。
        run：过滤器的具体逻辑。
 */
