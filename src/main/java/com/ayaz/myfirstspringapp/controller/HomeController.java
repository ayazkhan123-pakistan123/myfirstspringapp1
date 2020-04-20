package com.ayaz.myfirstspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/")
    public String sayhello(){
        return "HELLO FROM AYAZ";

    }

}
