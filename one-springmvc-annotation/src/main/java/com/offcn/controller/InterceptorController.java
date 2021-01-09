package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping("interceptor1.do")
    public String interceptor() {
        return "goodsupdate";
    }

}
