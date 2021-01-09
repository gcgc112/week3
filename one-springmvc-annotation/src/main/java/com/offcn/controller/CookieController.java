package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.text.CollationKey;

@Controller
public class CookieController {

    @RequestMapping("nocookie.do")
    public String nocookie(HttpServletResponse response) {
        //自定义cookie
        Cookie co = new Cookie("name", "德玛西亚");
        response.addCookie(co);
        return "goodsupdate";
    }

    @RequestMapping("havecookie.do")
    public String havecookie(@CookieValue("name") String name) {
        System.out.println(name);
        return "goodsupdate";
    }
}
