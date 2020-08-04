package com.story.test1.controller;

import com.story.test1.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ValidationController {
    @Validated
    @RequestMapping("/validation")
    public String validation(@Valid Person person, BindingResult bindingResult, Model model){

        System.out.println(person);
        Map<String,Object> map = new HashMap();
        if (bindingResult.hasErrors()){
            System.out.println("login failed");

            List<FieldError> allErrors = bindingResult.getFieldErrors();
            allErrors.forEach(err->{
                System.out.println(err.getField());
                System.out.println(err.getDefaultMessage());
                map.put(err.getField(),err.getDefaultMessage());
            });

            model.addAttribute("errors",map);

            return "forward:/login.jsp";
        }
        return "success";
    }
}
