package com.limala.demo.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 *     @WebFilter 不支持配置filter顺序
 *     采用配置@Bean的形式配置
 **/
//@WebFilter(filterName = "AppFilter", urlPatterns = "/*")
//@Order(2)
public class AppFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(AppFilter.class.getSimpleName() + " init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(AppFilter.class.getSimpleName() + " doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(AppFilter.class.getSimpleName() + " doFilter over");
    }

    @Override
    public void destroy() {
        System.out.println(AppFilter.class.getSimpleName() + " destroy");
    }
}
