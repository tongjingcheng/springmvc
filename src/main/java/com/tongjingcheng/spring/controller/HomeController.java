package com.tongjingcheng.spring.controller;

import ch.qos.logback.core.util.FileUtil;
import com.tongjingcheng.spring.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String hello(){
        return "index";
    }

    @RequestMapping(value = "/xml",produces = "application/xml;charset=utf-8")
    @ResponseBody
    public Order order(){
        Order order = new Order();
        order.setUserName("tong");
        order.setPassword("123456");
        order.setAge(123);
        return order;
    }

    @RequestMapping(value = "/json",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Order order2(){
        Order order = new Order();
        order.setUserName("tongjingcheng");
        order.setPassword("123456");
        order.setAge(456);
        return order;
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file){
        try {
            FileCopyUtils.copy(file.getBytes(),new File("/data/"+file.getOriginalFilename()));
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "fail";
    }
}
