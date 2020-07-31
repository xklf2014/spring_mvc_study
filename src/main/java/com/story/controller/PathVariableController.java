package com.story.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

    @RequestMapping(value = "/testPathVariable/{id}/{name}")
    public String testPathVariable(@PathVariable(value = "id") Integer id,@PathVariable(value = "name") String name){
        System.out.println(id + name);
        return "hello";
    }

}
