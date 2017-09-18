/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 23:25:48
 *
 */


package top.woshare.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * applicaton类加上注解@EnableZuulProxy，开启zuul的功能
 * Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分
 * @author Joran
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
    
}
