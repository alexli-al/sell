package com.mtx.sell;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mtx.sell.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                .title("SELL接口文档")//标题
                .description("详细描述")//详细描述  
                .version("1.0")//版本  
                .termsOfServiceUrl("NO terms of service")
                .contact("dogbro")//作者
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}  