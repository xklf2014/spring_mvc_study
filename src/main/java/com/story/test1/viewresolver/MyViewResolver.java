package com.story.test1.viewresolver;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;
@Component
@Order(1)
public class MyViewResolver implements ViewResolver {
    private int order = 0;
    @Override
    public View resolveViewName(String viewname, Locale locale) throws Exception {
        if (viewname.startsWith("story")){
            System.out.println(viewname);
            return new MyView();
        }
        return null;
    }

   /* @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }*/
}
