package com.zero.controller;

import com.zero.pojo.Test;
import com.zero.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CommonController {

    @Resource
    private TestService testService;

    @RequestMapping(value = {"/"})
    public String index() {
        System.out.println("CommonController : " + testService);
        testService.save(new Test());
        return "index";
    }

}
