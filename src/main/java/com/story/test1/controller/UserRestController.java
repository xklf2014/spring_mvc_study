package com.story.test1.controller;

import com.story.test1.bean.User;
import com.story.test1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserRestController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String save(){
        System.out.println("save begin");
        userDao.save(new User());
        System.out.println("save end");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(Integer id){
        System.out.println("update begin");
        userDao.update(id);
        System.out.println("update end");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String delete(Integer id){
        System.out.println("delete begin");
        userDao.delete(id);
        System.out.println("delete end");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String query(){
        System.out.println("query begin");
        userDao.query();
        System.out.println("query end");
        return "success";
    }
}
