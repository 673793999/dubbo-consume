package com.jtl.dubbo.controller;

import com.jtl.dubbo.service.DemoService;
import com.jtl.dubbo.service.impl.DemoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/18 0018.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource
    DemoService demoService;

    @RequestMapping("/demoFun")
    public @ResponseBody String demoFun(){
        return demoService.demoFun();
    }
}
