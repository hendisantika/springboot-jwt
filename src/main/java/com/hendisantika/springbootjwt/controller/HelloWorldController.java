package com.hendisantika.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-11
 * Time: 05:16
 */
@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }

}