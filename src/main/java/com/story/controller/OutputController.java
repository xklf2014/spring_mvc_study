package com.story.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes("name")
//@SessionAttributes(value = "name",types = Integer.class)
public class OutputController {

    @RequestMapping("/output1")
    public String output1(Map<String,String> map){
        map.put("msg","hello spring mvc");
        System.out.println(map.getClass());
        return "output";
    }

    @RequestMapping("/output2")
    public String output2(Model model){
        model.addAttribute("msg","hello spring mvc");
        System.out.println(model.getClass());
        return "output";
    }

    @RequestMapping("/output3")
    public String output3(ModelMap map){
        map.put("msg","hello spring mvc");
        System.out.println(map.getClass());
        return "output";
    }

    @RequestMapping("/output4")
    public ModelAndView output4(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("output");
        mv.addObject("msg","hello spring mvc");
        System.out.println(mv.getClass());
        return mv;
    }

    @RequestMapping("/testSession")
    public String testSession(Model model){
        model.addAttribute("name","zhangsan");
        return "output";
    }
}
