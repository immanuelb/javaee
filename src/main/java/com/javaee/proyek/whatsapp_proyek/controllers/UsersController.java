package com.javaee.proyek.whatsapp_proyek.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;

@Controller
@RequestMapping(path="/users")
public class UsersController {
    @Autowired
    private UsersRepository repository;

    //GET
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody Iterable<Users> getAllUsers() {
        return repository.findAll();
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Users getUsersById(@PathVariable("id") Id id) {
        return repository.findById();
    }*/

    //POST
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Users createUser(@Valid @RequestBody Users users) {
        repository.save(users);
        return users;
    }
}
