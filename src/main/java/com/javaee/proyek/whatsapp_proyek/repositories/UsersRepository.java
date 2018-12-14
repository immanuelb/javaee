package com.javaee.proyek.whatsapp_proyek.repositories;

import com.javaee.proyek.whatsapp_proyek.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByEmailAndPassword(String email, String Password);
}
