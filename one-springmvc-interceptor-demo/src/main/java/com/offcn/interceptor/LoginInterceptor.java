package com.offcn.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截或放行判断
        //当前案例addCart.do请求是拦截的，其它放行
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
        int i = url.lastIndexOf("/");
        String substring = url.substring(i + 1);
        if (!"addCart.do".equals(substring)) {
            return true;
        }
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username != null) {
            return true;
        }

        response.sendRedirect(request.getServletContext().getContextPath() + "/login.jsp");
        return false;
    }
}
