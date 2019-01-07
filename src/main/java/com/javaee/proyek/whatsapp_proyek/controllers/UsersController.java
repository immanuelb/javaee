package com.javaee.proyek.whatsapp_proyek.controllers;

import com.javaee.proyek.whatsapp_proyek.services.SecurityService;
import com.javaee.proyek.whatsapp_proyek.services.UserService;
import com.javaee.proyek.whatsapp_proyek.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value="/cekLogin", method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value="/cekLogin", method= RequestMethod.POST, params="action=Login")
    public String ceklogin_login(Model model, String error, String logout){
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "index";
    }

    @RequestMapping(value="/cekLogin", method= RequestMethod.POST, params="action=Register")
    public String ceklogin_register(){
        return "register";
    }

    @RequestMapping(value="/cekRegister", method= RequestMethod.POST, params="action=Login")
    public String cekregister_login(){
        return "index";
    }

    @RequestMapping(value="/cekRegister", method= RequestMethod.POST, params="action=Register")
    public String cekregister_register(@ModelAttribute("registerForm") Users userForm, BindingResult bindingResult, Model model){
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        //securityService.autologin(userForm.getEmail(), userForm.getPassword());

        return "redirect:/result";
    }
}
