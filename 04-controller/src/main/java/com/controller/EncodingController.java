package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test1(Model model,String name){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

}

