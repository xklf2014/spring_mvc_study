package com.story.test1.converter;


import com.story.test1.bean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MyConverter implements Converter<String, User> {

    @Override
    public User convert(String source) {
        User user = null;
        if (source != null && !"".equals(source) && source.split("-").length==4){
            user =  new User();
            user.setId(Integer.parseInt(source.split("-")[0]));
            user.setName(source.split("-")[1]);
            user.setAge(Integer.parseInt(source.split("-")[2]));
        }
        return user;
    }
}
