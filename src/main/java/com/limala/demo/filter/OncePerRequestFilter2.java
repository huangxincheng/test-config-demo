package com.limala.demo.filter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@SpringBootApplication
public class OncePerRequestFilter2 extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println(OncePerRequestFilter2.class.getSimpleName() + " doFilterInternal");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        System.out.println(OncePerRequestFilter2.class.getSimpleName() + " doFilterInternal over");
    }
}
