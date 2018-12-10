package com.limala.demo.config;

import com.limala.demo.filter.AppFilter;
import com.limala.demo.filter.IndexFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;


/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean buildIndexFilter() {
        return this.createFilterRegistrationBean(new IndexFilter(), "indexFilter", "/*", Integer.MAX_VALUE -1);
    }

    @Bean
    public FilterRegistrationBean buildAppFilter() {
       return this.createFilterRegistrationBean(new AppFilter(), "appFilter", "/*", Integer.MAX_VALUE);
    }

    public FilterRegistrationBean createFilterRegistrationBean(Filter filter, String filterName, String urlPatterns, int order) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setOrder(order);
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.setName(filterName);
        filterRegistrationBean.addUrlPatterns(urlPatterns);
        return filterRegistrationBean;
    }

}
