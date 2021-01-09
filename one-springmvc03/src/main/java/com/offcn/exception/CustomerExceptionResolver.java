package com.offcn.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;

@Component
public class CustomerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //给出友好页面
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("msg", "展示信息");

        //做出异常日志,把异常信息保存到数据库表中
        //文件输出流
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\error\\error.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            e.printStackTrace(pw);
            pw.close();
            fw.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return mv;
    }
}
