/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 19:44:24
 *
 */


package top.woshare.springcloudfeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualWoshareImpl implements SchedualWoshare{

    @Override
    public String sayHello(Integer id) {
        return "error" + id;
    }
}
