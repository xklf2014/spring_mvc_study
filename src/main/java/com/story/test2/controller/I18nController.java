package com.story.test2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;

@Controller
public class I18nController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/i18n")
    public String i18n(Locale locale) {
        System.out.println(locale);
        String username = messageSource.getMessage("username", null, locale);
        System.out.println(username);
        return "login";
    }

    @RequestMapping("/i18n2")
    public String i18n2(@RequestParam(value = "locale",required = false) String localeStr, Locale locale, HttpSession session) {
        Locale locale1 = null;
        if (localeStr != null && !"".equals(localeStr)){
            locale1 = new Locale(localeStr.split("_")[0],localeStr.split("_")[1]);
        }else{
            locale1 = locale;
        }
        session.setAttribute(SessionLocaleResolver.class.getName() + ".LOCALE",locale1);
        return "login";
    }

    @RequestMapping("/i18n3")
    public String i18n3(@RequestParam(value = "locale",required = false) String localeStr, Locale locale, HttpSession session) {

        return "login";
    }
}
