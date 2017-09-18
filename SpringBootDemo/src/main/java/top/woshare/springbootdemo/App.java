/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 22:47:25
 *
 */


package top.woshare.springbootdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class App {

    @RequestMapping("/index")
    String index(){
        return "ok";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
