package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DemoController {

    //进入详情页，不需要登录
    @RequestMapping("toItem.do")
    public String toItem() {
        return "goodsupdate";
    }

    //详情页中的不需要登录
    @RequestMapping("look.do")
    public String look() {
        return "goodslist";
    }

    //加入购物车--需要登录
    @RequestMapping("addCart.do")
    public String toCart() {
        return "cart";
    }

    //处理登录功能--实现登录
    @RequestMapping("login.do")
    public String login(String username, String password, HttpSession session) {
        System.out.println("username = " + username + ", password = " + password);
        //登录验证
        //登录成功，信息保存到session
        session.setAttribute("username", username);
        //登录成功回到详情页
        return "goodsupdate";
    }

}
