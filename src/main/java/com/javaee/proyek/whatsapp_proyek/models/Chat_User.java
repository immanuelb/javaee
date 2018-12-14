package com.javaee.proyek.whatsapp_proyek.models;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "chat_user")
public class Chat_User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "id_chat")
    private Integer idChat;
    @Column(name = "id_target")
    private Integer idTarget;
    private LocalDateTime time;

    public Chat_User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdChat() {
        return idChat;
    }

    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

    public Integer getIdTarget() {
        return idTarget;
    }

    public void setIdTarget(Integer idTarget) {
        this.idTarget = idTarget;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
