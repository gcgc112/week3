package com.offcn.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor {

    /*
    perHandler方法决定拦截或者放行的方法
    此方法的返回值为true或者false，如果为true表示放行，如果为false表示拦截
    通常采用此方法实现登录验证
    此方法想Controller中方法的前面切入---前通知
    如果此方法没有放行，以下两个方法都执行不到
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //返回值为false表示拦截
        return true;
    }

    /**
     * postHandler方法没有拦截或者放行的功能
     * 此方法通常用于统一设置模型和视图
     * 此方法在controller的方法执行之后，返回模型和视图名给适配器之前切入，相当于后通知
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //获取测试：获取从后端控制器到适配器的模型和视图
        //获取模型
        ModelMap mm = modelAndView.getModelMap();
        Object name = mm.get("name");
        System.out.println(name);

        //获取视图
        String viewName = modelAndView.getViewName();
        System.out.println(viewName);
        //更改视图名
        modelAndView.setViewName("downloadlist");
    }

    /*
    afterCompletion方法也没有拦截和放行的功能
    此方法通常用于接受异常，做异常处理中心
    此方法在执行流程中视图解析器返回视图文件给前端控制器时切入
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String message = ex.getMessage();
        System.out.println(message);
    }
}
