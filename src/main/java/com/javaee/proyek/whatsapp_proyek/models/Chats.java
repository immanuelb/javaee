package com.javaee.proyek.whatsapp_proyek.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chats {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String email;
    private String password;

}
