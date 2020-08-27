package com.story.test2.controller;

import com.story.test2.UsernameException;
import com.story.test2.bean.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Null;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception(){
        System.out.println(this.getClass().getName());
        System.out.println(1/0);
        return "success";

    }

    @RequestMapping("/exception2")
    public String exception2(){
        System.out.println(this.getClass().getName());
        String a = null;
        System.out.println(a.toString());
        return "success";

    }

    @RequestMapping("/exception3")
    public String exception3() throws FileNotFoundException {
        System.out.println(this.getClass().getName());
        File file = new File("a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        return "success";

    }

    @RequestMapping("/exception4")
    public String exception4(String username) {
        System.out.println("exception4");
        if ("admin".equals(username)){
            return "success";
        }else {
            throw new UsernameException();
        }
    }

    @RequestMapping(value = "/exception5",method = RequestMethod.POST)
    public String exception5() {
        System.out.println("exception5");
        return "success";

    }

    @ResponseStatus(reason = "我是用来捕捉数学异常",value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView handlerException(Exception e){
        System.out.println("handlerException");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",e);
        return mv;
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ModelAndView handlerException2(Exception e){
        System.out.println("handlerException2");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",e);
        return mv;
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handlerException3(Exception e){
        System.out.println("handlerException3");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",e);
        return mv;
    }
}
