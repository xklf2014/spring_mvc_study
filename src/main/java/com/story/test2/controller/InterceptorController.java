package com.story.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println(this.getClass().getName());
        return "success";
    }
}
