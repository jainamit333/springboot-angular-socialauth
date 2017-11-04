package com.test.practise.controller;

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

    @RequestMapping("test")
    public String test(){
        return "test api data";
    }


}
