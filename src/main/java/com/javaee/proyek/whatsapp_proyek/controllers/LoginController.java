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
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
public class LoginController {
    @Autowired
    private UsersRepository usersRepository;

    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView findUserByEmailAndPassword(@Valid Users user){
        ModelAndView modelAndView = new ModelAndView();
        Users userExist = usersRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
        if(userExist != null){
            modelAndView.setViewName("home");
        }
        else{
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }*/
}
