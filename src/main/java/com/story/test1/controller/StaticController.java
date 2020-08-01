package com.story.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {
    @RequestMapping("/static")
    public String testStatic(){
        System.out.println("static");
        return "forward:/index.jsp";
    }

/*    @RequestMapping("/static1")
    public String testStatic1(){
        System.out.println("static1");
        return "/WEB-INF/page/success.jsp";
    }*/
}
