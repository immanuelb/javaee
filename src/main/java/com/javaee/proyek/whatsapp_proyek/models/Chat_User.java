package com.javaee.proyek.whatsapp_proyek.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.*;

@Entity
public class Chats {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer id_user;
    private Integer id_chat;
    private Integer id_target;
    private LocalDateTime time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_chat() {
        return id_chat;
    }

    public void setId_chat(Integer id_chat) {
        this.id_chat = id_chat;
    }

    public Integer getId_target() {
        return id_target;
    }

    public void setId_target(Integer id_target) {
        this.id_target = id_target;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
