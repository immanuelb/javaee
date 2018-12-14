package com.javaee.proyek.whatsapp_proyek.repositories;

import com.javaee.proyek.whatsapp_proyek.models.Users;
//import org.bson.types.ObjectId;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    //Users findByUsername(String username);
}
