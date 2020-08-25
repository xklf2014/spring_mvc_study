package com.story.test2.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntityController {

    @RequestMapping("/testHttpEntity")
    public String testHttpEntity(HttpEntity<String> httpEntity) {
        System.out.println(httpEntity);
        return "success";
    }

    @RequestMapping("/testResponseEntity")
    public ResponseEntity<String> testResponseEntity() {
        String str = "<h1>hello springmvc</h1>";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Set-Cookie","name=zhangsan");
        return new ResponseEntity<String>(str,httpHeaders, HttpStatus.OK);
    }
}
