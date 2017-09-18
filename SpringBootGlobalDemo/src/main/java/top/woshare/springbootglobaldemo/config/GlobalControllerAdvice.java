/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-7 10:36:11
 *
 */

package top.woshare.springbootglobaldemo.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常返回信息
 * @author Joran
 */

@ControllerAdvice
public class GlobalControllerAdvice {
    
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errHeader(Exception e){
        Map map = new HashMap();
        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            map.put("code", 404);
        }else{
            map.put("code", 500);
        }
        map.put("msg", e.getMessage());
        map.put("data", null);
        return map;
    }
    
//    自定义的异常返回
    @ResponseBody
    @ExceptionHandler(value=GlobalException.class)
    public Map globalExceptionHeader(GlobalException e){
        Map map = new HashMap();
        map.put("code", e.getCode());
        map.put("msg", e.getMsg());
        map.put("data", e.getData());
        return map;
    }
}
