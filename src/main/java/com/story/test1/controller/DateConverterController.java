package com.story.test1.controller;

import com.story.test1.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateConverterController {
    @RequestMapping("testDateConverter")
    public String testDateConverter(User user){
        System.out.println(user);
        return "success";
    }
}
