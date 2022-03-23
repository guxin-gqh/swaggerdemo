package com.guxin.demo.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author founder
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket1(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xiaogu1")
                .select()
                //RequestHandlerSelectors，配置要扫描的接口方式
                // basePackage扫描指定的包
                //any():扫描全部的包
                //none（）：不扫描
                //withClassAnnotation()：扫描类上的注解，参数是一个注解的扫描对象
                //withMethodAnnotation()：扫描方法上的注解

                .apis(RequestHandlerSelectors.basePackage("com.guxin.demo.controller"))
                //paths()过滤什么路径
                .paths(PathSelectors.ant("/guxin/**"))
                .build();
    }
    @Bean
    public Docket docket2(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xiaogu2")
                .select()
                //RequestHandlerSelectors，配置要扫描的接口方式
                // basePackage扫描指定的包
                //any():扫描全部的包
                //none（）：不扫描
                //withClassAnnotation()：扫描类上的注解，参数是一个注解的扫描对象
                //withMethodAnnotation()：扫描方法上的注解

                .apis(RequestHandlerSelectors.basePackage("com.guxin.demo.controller"))
                //paths()过滤什么路径
                .paths(PathSelectors.ant("/guxin/**"))
                .build();
    }
    @Bean
    public Docket docket3(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xiaogu3")
                .select()
                //RequestHandlerSelectors，配置要扫描的接口方式
                // basePackage扫描指定的包
                //any():扫描全部的包
                //none（）：不扫描
                //withClassAnnotation()：扫描类上的注解，参数是一个注解的扫描对象
                //withMethodAnnotation()：扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.guxin.demo.controller"))
                //paths()过滤什么路径
                //.paths(PathSelectors.ant("/guxin/**"))
                .build();
    }

    //配置了swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xiaogu")
                .select()
                //RequestHandlerSelectors，配置要扫描的接口方式
                // basePackage扫描指定的包
                //any():扫描全部的包
                //none（）：不扫描
                //withClassAnnotation()：扫描类上的注解，参数是一个注解的扫描对象
                //withMethodAnnotation()：扫描方法上的注解

                .apis(RequestHandlerSelectors.basePackage("com.guxin.demo.controller"))
                //paths()过滤什么路径
                .paths(PathSelectors.ant("/guxin/**"))
                .build();
    }
    private ApiInfo apiInfo(){
        Contact contact=new Contact("hh", "hhh", "jjj");
        return  new ApiInfo("guxin", "Api study", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }
}
