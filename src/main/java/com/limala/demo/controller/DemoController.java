package com.limala.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping
    public String index() {
        return "index";
    }
}
