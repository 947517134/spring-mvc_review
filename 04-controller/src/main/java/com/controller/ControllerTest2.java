package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 

//代表这个类被会被Spring接管，被注解的类中的方法，如果返回值是string，并且有具体的页面可以跳转，那么就会被视图解析器解析
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){

        model.addAttribute("msg","ControllerTest2");

        return "test";  //标上controller后return值会被视图解析器处理
    }
}
