package com.javaee.proyek.whatsapp_proyek.services;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import com.javaee.proyek.whatsapp_proyek.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public Users findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }
}
