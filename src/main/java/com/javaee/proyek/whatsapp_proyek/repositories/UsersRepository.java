package com.javaee.proyek.whatsapp_proyek.repositories;

import com.javaee.proyek.whatsapp_proyek.models.Users;
//import org.bson.types.ObjectId;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Long> {
    //Users findByUsername(String username);

    @Query(value = "select * from users where email = :email and password = :password ", nativeQuery = true)
    Users findUserAccount(@Param("email") String email, @Param("password") String password);
}
