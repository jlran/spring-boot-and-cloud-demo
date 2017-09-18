/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 23:27:49
 *
 */


package top.woshare.springbootdemo.web;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.woshare.springbootdemo.domain.GlobalMessage;
import top.woshare.springbootdemo.domain.User;
import top.woshare.springbootdemo.service.UserService;


/**
 * User控制层
 * @author Joran
 */

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Resource
    private UserService userService;
    
    @ApiOperation(value="获取用户",notes = "获取用户的信息")
    @ApiImplicitParam(name = "id",value="用户的id",required = true,dataType = "Long")
    @RequestMapping( value = {"/get/{id}"},method = {RequestMethod.GET})
    public  String getUser(@PathVariable Long id) {
        User user = userService.find(id);
        GlobalMessage globalMessage = new GlobalMessage();
        if(user == null){
            globalMessage.setMessage("error");
        }else{
            user.setPassword("");
            globalMessage.setMessage("ok");
        }
        globalMessage.setStatus(200);
        List list = new ArrayList();
        list.add(user);
        globalMessage.setResult(list);
        return JSONObject.toJSONString(globalMessage);
    }
    
    @ApiOperation(value = "注册用户",notes = "注册用户")
    @ApiImplicitParam(name = "user",value = "用户信息的实体",required = true,dataType = "User")
    @RequestMapping(value = "/save",method = {RequestMethod.POST})
    public String postUser(@RequestBody User user){
        User u = userService.save(user);
        GlobalMessage globalMessage = new GlobalMessage();
        globalMessage.setStatus(200);
        Boolean flage = user.getName().equals(u.getName());
        globalMessage.setMessage(flage.toString());
        globalMessage.setResult(null);
        return JSONObject.toJSONString(globalMessage);
    }
}
