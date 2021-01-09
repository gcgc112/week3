package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ParameterController {

    @RequestMapping("noparameter.do")
    public String noparameter(@RequestParam(defaultValue = "1000") int id, @RequestParam(defaultValue = "张三") String name) {
        System.out.println("id = " + id + ", name = " + name);
        return "goodsupdate";
    }

    //重定向第一个单元
    @RequestMapping("first.do")
    public String first(RedirectAttributes attributes) {
        attributes.addFlashAttribute("name", "王五");
        return "redirect:/second.do";
    }

    //重定向第二个单元
    @RequestMapping("second.do")
    public String second(@ModelAttribute("name") String name) {
        System.out.println("name = " + name);
        return "goodsupdate";
    }


}
