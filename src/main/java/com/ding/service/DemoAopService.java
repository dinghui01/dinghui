package com.ding.service;

import com.ding.aop.NotVeryUsefulAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created  by DHui on 2021/10/17.
 */
@Service
public class DemoAopService {
    Logger logger = LoggerFactory.getLogger(DemoAopService.class);
    public void testAop1(){
        logger.info("测试 service.......");
    }
}
