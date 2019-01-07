package com.javaee.proyek.whatsapp_proyek.services;

import com.javaee.proyek.whatsapp_proyek.models.Users;

public interface UserService {
    void save(Users user);

    Users findByEmailAndPassword(String email, String password);
}
