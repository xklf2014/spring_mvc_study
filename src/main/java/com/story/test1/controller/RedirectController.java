package com.story.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    @RequestMapping("/redirect")
    public String redirect(){
        System.out.println("redirect");

        return "redirect:/index.jsp";
    }

    @RequestMapping("/redirect2")
    public String redirect2(){
        System.out.println("redirect2");

        return "redirect:/redirect";
    }
}
