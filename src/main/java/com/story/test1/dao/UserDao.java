package com.story.test1.dao;

import com.story.test1.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void save(User user){
        System.out.println("save user");
    }

    public void update(Integer id){
        System.out.println("update user" + id);
    }

    public void delete(Integer id){
        System.out.println("delete user " + id);
    }

    public void query(){
        System.out.println("query user");
    }
}
