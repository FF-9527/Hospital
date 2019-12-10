package com.qf.hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: Hospital
 * @author: FF
 * @date: 2019-12-10 21:53
 */
@Configuration // 配置文件
public class SwaggerConfig {
    // 创建文档说明
    public ApiInfo createApi() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("Yard项目后端数据接口").
                description("包含Yard的主站和后台系统的所有接口信息，可以查看对应的接口信息和对接口进行测试").contact(new Contact("Feri","http://www.17feri.top","xingfei_work@163.com")).build();
        return apiInfo;
    }

    // 创建Swagger扫描信息
    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().apis(RequestHandlerSelectors.basePackage("com.qf.hospital")).build();
    }
}
