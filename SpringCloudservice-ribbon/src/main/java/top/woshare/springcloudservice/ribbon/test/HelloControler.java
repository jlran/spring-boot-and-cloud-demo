/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 18:18:09
 *
 */


package top.woshare.springcloudservice.ribbon.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串，
 * 当woshare工程不可用的时候，调用error
 * @author Joran
 */

@RestController
public class HelloControler {
    @Autowired
    private HelloService helloService;
    
    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping("/hello")
    public String hi(){
        return helloService.hiService();
    }
    
    public String error(){
        return "error";
    }
}
