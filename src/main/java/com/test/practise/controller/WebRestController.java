package com.test.practise.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amitjain on 8/2/17.
 */
@RefreshScope
@RestController
@RequestMapping("/api")
public class WebRestController {


    @Value("${user.role}")
    private String role;

    @RequestMapping("test")
    public String test(){
        return role;
    }


}
