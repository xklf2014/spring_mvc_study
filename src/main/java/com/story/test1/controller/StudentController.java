package com.story.test1.controller;

import com.story.test1.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @RequestMapping("/testStudent")
    public String testStudent(Student student){
        System.out.println(student.toString());
        return "success";
    }

    @RequestMapping("/api")
    public String api(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        request.setAttribute("request",request);
        session.setAttribute("session",session);
        return "success";
    }

}
