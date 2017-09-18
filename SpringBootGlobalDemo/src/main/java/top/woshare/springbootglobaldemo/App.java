/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-7 9:54:04
 *
 */

package top.woshare.springbootglobaldemo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.woshare.springbootglobaldemo.config.GlobalException;
import top.woshare.springbootglobaldemo.domain.User;


@Controller
@SpringBootApplication
public class App {
    
    @RequestMapping("/index")
    public void index() throws GlobalException{
        List list = new ArrayList();
        User user = new User();
        user.setAge(12);
        user.setName("joran");
        user.setPassword("11111111");
        list.add(user);
        throw  new GlobalException(100, "ok", list);
    }
    
    public static void main(String[] args) {
         SpringApplication.run(App.class, args);
    }
}
