package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pojo.User;
import com.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//@Controller
@RestController
public class UserController {

    @RequestMapping("/j1")
//    @ResponseBody  //他就不会走视图解析器，会直接返回一个字符串
    public String json1(){

        //创建一个对象
        User user = new User("jason",3,"男");

        return user.toString();
    }


    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        ArrayList<User> userList = new ArrayList<User>();

        User user1 = new User("jason1",3,"男");
        User user2 = new User("jason2",3,"男");
        User user3 = new User("jason3",3,"男");
        User user4 = new User("jason4",3,"男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;

    }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException{

        Date date = new Date();

        //ObjectMapper，时间解析后的默认格式为：Timestamp，时间戳
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");

    }
}
