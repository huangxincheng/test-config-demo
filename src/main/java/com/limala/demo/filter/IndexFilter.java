package com.limala.demo.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
//@WebFilter(filterName = "indexFilter", urlPatterns = "/*")
//@Order(1)
public class IndexFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(IndexFilter.class.getSimpleName() + " init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(IndexFilter.class.getSimpleName() + " doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(IndexFilter.class.getSimpleName() + " doFilter over");
    }

    @Override
    public void destroy() {
        System.out.println(IndexFilter.class.getSimpleName() + " destroy");
    }
}
