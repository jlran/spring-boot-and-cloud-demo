/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 17:38:39
 *
 */


package top.woshare.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @EnableEurekaClient 表明自己是一个eurekaclient.
 * @author Joran
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class App {
    
    @Value("${server.port}")
    private String port;
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/")
    public String index(){
        return "我是" + port;
    }
    
    @RequestMapping("/{id}")
    public String index(@PathVariable Integer id){
        return "我是" + port + "=>" + id;
    }
}
