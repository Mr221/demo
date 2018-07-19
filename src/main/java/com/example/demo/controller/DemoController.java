package com.example.demo.controller;

import com.example.demo.service.DemoService;
import com.example.demo.service.DemoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@ConditionalOnWebApplication
public class DemoController {

    @Autowired
    DemoServiceImp demoServiceImp;

    @GetMapping(value = "/getID")
    public String getID(){
        return demoServiceImp.getID();
    }

    @GetMapping(value = "/getName")
    public String getName(@PathVariable String id){
        return demoServiceImp.getName(id);
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@RequestBody String body){
        return demoServiceImp.saveUser(body);
    }
}
