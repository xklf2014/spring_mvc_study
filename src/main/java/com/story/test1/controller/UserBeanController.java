package com.story.test1.controller;

import com.story.test1.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserBeanController {

    @RequestMapping("/updateUser")
    public String update(@ModelAttribute("userBean") UserBean userBean) {
        System.out.println(userBean);
        return "update";
    }

    @ModelAttribute
    public void testModelAttribute(Model model) {
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setName("lisi");
        userBean.setAge(20);
        userBean.setPassword("123456");
        model.addAttribute("userBean", userBean);
    }




}
