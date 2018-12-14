package com.javaee.proyek.whatsapp_proyek.controllers;

import com.javaee.proyek.whatsapp_proyek.models.Chat_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javaee.proyek.whatsapp_proyek.repositories.ChatRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Optional<Chat_User> persist(final Chat_User chat_user) {
        chat_user.setIdChat(1);
        chat_user.setIdTarget(1);
        chat_user.setIdUser(1);
        chat_user.setTime(LocalDateTime.now());
        chatRepository.save(chat_user);
        return chatRepository.findById((long) chat_user.getId());
    }
}
