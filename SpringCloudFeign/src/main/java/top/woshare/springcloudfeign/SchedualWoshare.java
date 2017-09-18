/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 19:07:23
 *
 */


package top.woshare.springcloudfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "woshare",fallback =SchedualWoshareImpl.class )
public interface SchedualWoshare {
//    这里的getmapping对应的是woshare里面的访问路径
    @GetMapping("/")
    public String sayHello(@RequestParam(value = "id") Integer id);
}


