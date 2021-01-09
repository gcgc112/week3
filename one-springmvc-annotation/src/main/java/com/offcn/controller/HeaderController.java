package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("header.do")
    public String header(@RequestHeader("accept") String accept, @RequestHeader("host") String host) {
        System.out.println("accept = " + accept + ", host = " + host);
        return "goodsupdate";
    }

}
