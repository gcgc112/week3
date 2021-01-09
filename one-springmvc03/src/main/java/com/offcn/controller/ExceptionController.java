package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    /*//局部中心就是当前controller中的一个方法
    @ExceptionHandler(Exception.class)  //标志当前是局部异常处理中心;Exception.class表示无论下层或本层抛到此处的是哪一种异常，都可以接收
    public String exceptionCenter() {
        //友好页面
        return "error";
    }*/

    @RequestMapping("exception1.do")
    public String exc() {
        //此方法中可能有异常，也可能没有异常
        //如果没有异常，响应goodsupdate

        //如果有异常，响应error.jsp
        int i = 10 / 0;

        return "goodsupdate";
    }


}
