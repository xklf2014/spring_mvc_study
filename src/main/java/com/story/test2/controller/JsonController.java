package com.story.test2.controller;

import com.story.test2.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {

    @RequestMapping("json")
    @ResponseBody
    public List<User> json(){
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"zhangsan",20,"man"));
        users.add(new User(2,"lisi",22,"woman"));
        users.add(new User(3,"wangwu",25,"man"));
        users.add(new User(4,"zhaoliu",28,"woman"));
        return users;
    }

    @RequestMapping("json2")
    @ResponseBody
    public String json2(){
        return "<h1>Hello,Json</h1>";
    }

    @RequestMapping("/testRequest")
    public String testRequest(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testRequestJson")
    public String testRequestJson(@RequestBody  User user){
        System.out.println(user);
        return "success";
    }
}
