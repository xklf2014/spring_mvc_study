package com.story.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {

    @RequestMapping("/request")
    public String testRequest(@RequestParam("username") String name){
        System.out.println("test request" + name);
        return "success";
    }

    @RequestMapping("/requesthead")
    public String testRequestHead(@RequestHeader("User-Agent") String userAgent){
        System.out.println(userAgent.toString());
        return "success";
    }

    @RequestMapping("/testCookie")
    public String testCookie(@CookieValue("JSESSIONID") String jsid){
        System.out.println(jsid);
        return "success";
    }
}
