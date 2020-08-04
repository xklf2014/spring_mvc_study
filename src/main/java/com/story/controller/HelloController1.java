package com.story.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController1 {

 /*   @RequestMapping("/hello")
    public String hello(Map<String ,String> map){
        map.put("hello","hello spring mvc");
        return "hello";

    }*/

    @RequestMapping(value = "/hello1", method = RequestMethod.POST)
    public String hello1(Map<String ,String> map){
        map.put("hello","hello spring mvc");
        return "hello";

    }

    @RequestMapping(value = "/hello2", params = {"username=aaa","age"})
    public String hello2(Map<String ,String> map){
        map.put("hello","hello spring mvc");
        return "hello";

    }

    @RequestMapping(value = "/hello3", headers = {"User-Agent=Mozilla\\/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit\\/537.36 (KHTML, like Gecko) Chrome\\/64.0.3282.140 Safari\\/537.36 Edge\\/17.17134"})
    public String hello3(Map<String ,String> map){
        map.put("hello","hello spring mvc");
        return "hello";

    }

    @RequestMapping(value = "/**/h*llo?")
    public String hello4(){
        System.out.println("hello4");
        return "hello";
    }
}
