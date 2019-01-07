package com.javaee.proyek.whatsapp_proyek.repositories;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByEmailAndPassword(String email, String Password);
}
