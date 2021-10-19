package com.ding.controller;

import com.ding.service.DemoAopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created  by DHui on 2021/10/17.
 */
@Controller
@RequestMapping("/test")
public class DemoAopController {
    @Autowired
    private DemoAopService demoAopService;

    @GetMapping("/cont")
    @ResponseBody
    public String testController(HttpServletRequest request, HttpServletResponse response){

        demoAopService.testAop1();
        return "hello springboot";
        /*try {
            response.getWriter().write("hello springboot");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
