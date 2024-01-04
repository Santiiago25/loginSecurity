package com.login.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CustomerController {

    @GetMapping("/index")
    public String index(){
        return "Hola Mundo";
    }

    @GetMapping("/index2")
    public String index2(){
        return "Hola Mundo Nor Security";
    }

}
