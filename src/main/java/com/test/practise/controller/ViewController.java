package com.test.practise.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by amitjain on 8/4/17.
 */
@Slf4j
@ApiIgnore
@Controller
public class ViewController {

//    @RequestMapping(value={"/"})
//    public String index() {
//        return "index.html";
//    }


    @RequestMapping({ "/","/welcome" })
    public String views() {
        return "forward:/index.html";
    }

}
