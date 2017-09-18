/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-6 9:59:12
 *
 */

package top.woshare.springbootkaptcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import java.util.Properties;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class App {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
    
    
    @Bean
    public DefaultKaptcha captchaProducer(){
            DefaultKaptcha captchaProducer =new DefaultKaptcha();
            Properties properties =new Properties();
            properties.setProperty("kaptcha.border","no");
            properties.setProperty("kaptcha.border.color","105,179,90");
            properties.setProperty("kaptcha.textproducer.font.color","red");
            properties.setProperty("kaptcha.image.width","125");
            properties.setProperty("kaptcha.image.height","45");
            properties.setProperty("kaptcha.textproducer.font.size","45");
            properties.setProperty("kaptcha.session.key","code");
            properties.setProperty("kaptcha.textproducer.char.length","4");
            properties.setProperty("kaptcha.textproducer.font.names","宋体,楷体,微软雅黑");
            Config config=new Config(properties);
            captchaProducer.setConfig(config);
            return  captchaProducer;
    }
}
    
