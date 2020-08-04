package com.story.test1.controller;

import com.story.test1.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyConverterController {

    @RequestMapping("/converter")
    public String myTestConverter(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
