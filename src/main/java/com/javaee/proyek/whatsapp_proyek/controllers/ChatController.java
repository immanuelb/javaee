package com.javaee.proyek.whatsapp_proyek.controllers;

import com.javaee.proyek.whatsapp_proyek.models.Chat_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.javaee.proyek.whatsapp_proyek.repositories.ChatRepository;

import java.util.List;

@RestController
@RequestMapping(path="/rest/chats")
public class ChatController {
    @Autowired
    private ChatRepository chatRepository;

    @GetMapping(value = "/all")
    public List<Chat_User> getAllChats() {
        return chatRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Chat_User> persist(@RequestBody final Chat_User chat_user) {
        chatRepository.save(chat_user);
        return chatRepository.findAll();
    }
}
