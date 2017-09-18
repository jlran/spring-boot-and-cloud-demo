/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-7 0:00:04
 *
 */


package top.woshare.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ApiOperation注解来给API增加说明
 * @ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明
 * http://localhost:8080/swagger-ui.html
 * @author Joran
 */


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("使用Swagger2构建RESTful APIs")
                .description("客户端与服务端接口文档")
                .termsOfServiceUrl("http://localost:8080")
                .contact("Jo Ran")
                .version("1.0.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.woshare"))
                .paths(PathSelectors.any())
                .build();
    }
}