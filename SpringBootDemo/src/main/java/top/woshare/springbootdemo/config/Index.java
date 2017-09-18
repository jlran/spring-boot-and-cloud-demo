/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 23:08:26
 *
 */


package top.woshare.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置访问首页
 * @author Joran
 */

@Controller
@Configuration
public class Index extends WebMvcConfigurerAdapter{
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController( "/" ).setViewName( "forward:/index.html" );
	    registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
		super.addViewControllers(registry);
	}
}
