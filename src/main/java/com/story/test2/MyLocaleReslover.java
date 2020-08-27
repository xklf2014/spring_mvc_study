package com.story.test2;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleReslover implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        Locale locale = null;
        String str = request.getParameter("locale");
        if(str != null && !"".equals(str)){
            locale = new Locale(str.split("_")[0],str.split("_")[1]);
        }else {
            locale = request.getLocale();
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
        throw new UnsupportedOperationException("Cannot change HTTP accept header - use a different locale resolution strategy");
    }
}
