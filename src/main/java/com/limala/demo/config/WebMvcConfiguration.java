package com.limala.demo.config;

import com.limala.demo.interceptor.AppInterceptor;
import com.limala.demo.interceptor.IndexInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

    /**
     * 配置拦截器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new AppInterceptor());
        registry.addInterceptor(new IndexInterceptor());
    }
}
