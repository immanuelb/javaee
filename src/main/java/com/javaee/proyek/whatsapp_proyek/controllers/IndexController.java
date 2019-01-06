package com.javaee.proyek.whatsapp_proyek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping(value = "")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/cekLogin", method= RequestMethod.POST, params="action=Login")
    public String login(){
        return "login";
    }
    @RequestMapping(value="/cekLogin", method= RequestMethod.POST, params="action=Register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/home")
    public String getHomePage(@RequestParam("username") String uname, @RequestParam("password") String password){
        return "home";
    }
}
