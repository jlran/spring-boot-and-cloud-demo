/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-10 18:13:41
 *
 */


package top.woshare.springcloudservice.ribbon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService() {
        return restTemplate.getForObject("http://woshare",String.class);
    }
}
