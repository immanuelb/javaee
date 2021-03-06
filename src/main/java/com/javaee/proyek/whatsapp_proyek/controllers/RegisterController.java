package com.javaee.proyek.whatsapp_proyek.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;


@Controller
@RequestMapping(path = "/register")
public class RegisterController {
    @Autowired
    private UsersRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String coba(@ModelAttribute("Users") Users users, ModelMap model){
        LocalDateTime today = LocalDateTime.now();
        users.setStatus(1);
        users.setVerified(0);
        users.setLastLogin(today);
        repository.save(users);
        //model.addAttribute("email", users.getEmail());
        //model.addAttribute("username", loginForm.getUsername());
        return "result";
    }
}
