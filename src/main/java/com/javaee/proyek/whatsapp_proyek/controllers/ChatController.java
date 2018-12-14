package com.javaee.proyek.whatsapp_proyek.controllers;

import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaee.proyek.whatsapp_proyek.models.Chats;
import com.javaee.proyek.whatsapp_proyek.repositories.ChatRepository;

@Controller
@RequestMapping(path="/chat")
public class ChatController {
    @Autowired
    private ChatRepository repository;
}
