package com.example.lianfang.Controller;

import com.alibaba.fastjson.JSON;
import com.example.lianfang.entity.User;
import com.example.lianfang.service.Sys_classService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("class/")
public class Sys_classController {
    @Autowired
    Sys_classService sys_classService;

    @PostMapping("/getClass")
    public String getClass(@RequestParam (value = "bushi") String i){
        if(i.equals("sd") ){
            return "Yes";

        }
        return "No" + i ;
    }
    @PostMapping("/test")
    public String test(@RequestBody User user){
        return JSON.toJSONString(user);
    }
}
