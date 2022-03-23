package com.guxin.demo.controller;

import com.guxin.demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author founder
 */
@RestController
@Api(tags = {"xxxxxxxxx"})
public class HelloController {

    @ApiOperation("hello控制类")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    //只要我们的接口中，返回存在实体类，它就会被扫描到swagger
    @ApiOperation("user控制类")
    @GetMapping("/user")
    public User user(){
        return new User();
    }
}
