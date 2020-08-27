package com.story.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolverController {

    @RequestMapping("/story")
    public String testView(){
        System.out.println("hello");
        return "story:/index";
    }

    @RequestMapping("/story1")
    public String testView1(){
        System.out.println("hello1");
        return "story:index";
    }

    @RequestMapping("/sss")
    public String testView2(){
        System.out.println("hello2");
        return "story:/index";
    }
}
