package com.ding.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created  by DHui (Tel:7490) on 2021/9/12.
 */
@Controller
public class B {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private A a;

    public A getA() {
        return a;
    }
    @Autowired
    public void setA(A a) {
        this.a = a;
        logger.info("B里面设置了A");
    }
}
