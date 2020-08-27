package com.story.test2;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    public ModelAndView handlerException2(Exception e){
        System.out.println("global handlerException2");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",e);
        return mv;
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView handlerException3(Exception e){
        System.out.println("global handlerException3");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exception",e);
        return mv;
    }
}
