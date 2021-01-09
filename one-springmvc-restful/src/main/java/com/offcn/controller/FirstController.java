package com.offcn.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("first/{id}/{name}")
    //把页面中携带的值通过变量给形参
    public String first(@PathVariable("id") int id, @PathVariable("name") String name) {
        System.out.println("id = " + id + ", name = " + name);
        return "goodsupdate";
    }
}
