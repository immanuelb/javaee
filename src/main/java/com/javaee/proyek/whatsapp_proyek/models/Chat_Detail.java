package com.javaee.proyek.whatsapp_proyek.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chat_detail")
public class Chat_Detail {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_chat")
    private Integer idChat;
    @Column(name = "msg")
    private String msg;

    public Chat_Detail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdChat() {
        return idChat;
    }

    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
