package com.javaee.proyek.whatsapp_proyek.repositories;

import com.javaee.proyek.whatsapp_proyek.models.Chat_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat_User, Long> {

}
