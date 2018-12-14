package com.javaee.proyek.whatsapp_proyek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String getHomePage(@RequestParam("username") String uname, @RequestParam("password") String password){
        return "home";
    }
}
