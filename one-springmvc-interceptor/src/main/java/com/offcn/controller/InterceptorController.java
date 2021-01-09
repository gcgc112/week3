package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping("interceptor1.do")
    public String interceptor(Model model) {
        //int i = 10 / 0;
        model.addAttribute("name", "嘚嘚得");
        return "goodsupdate";
    }


}
