/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 19:09:33
 *
 */

package top.woshare.springcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SchedualWoshare schedualWoshare;
    
    @GetMapping("/")
    public String sayHello(@RequestParam(value = "id" ) Integer id){
        return schedualWoshare.sayHello(id);
    }
}
