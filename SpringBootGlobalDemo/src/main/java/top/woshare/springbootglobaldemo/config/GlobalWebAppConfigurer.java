/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-7 13:01:12
 *
 */

package top.woshare.springbootglobaldemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * 配置拦截器
 * @author Joran
 */

@Configuration
public class GlobalWebAppConfigurer extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new GlobalErrorInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry); 
    }
    
}
