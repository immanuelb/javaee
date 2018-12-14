package com.javaee.proyek.whatsapp_proyek.controllers;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UsersRepository repository;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String ceklogin(@ModelAttribute("Users") Users users, Model model){
        Users m_resultQuery = repository.findUserAccount(users.getEmail(),users.getPassword());
        model.addAttribute("user",repository.findUserAccount(users.getEmail(),users.getPassword()));
        //model.addAttribute("pass",users.getPassword());
        //model.addAttribute("pass2",users.getEmail());
        if(m_resultQuery != null){
            return "home";
        }
        return "login";
        //model.addAttribute("dataUser",repository.findUserAccount("arthursamuel96@outlook.com","asd"));
    }
}
