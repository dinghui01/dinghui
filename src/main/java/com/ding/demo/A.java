package com.ding.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created  by DHui (Tel:7490) on 2021/9/12.
 */
@Controller
public class A {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private B b;

    public B getB() {
        return b;
    }
    @Autowired
    public void setB(B b) {
        this.b = b;
        logger.info("A里面设置了B");
    }
}
