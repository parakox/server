package com.example.demo.serviceImpl;

import com.example.demo.model.Chat;
import com.example.demo.repository.ChatRepository;
import com.example.demo.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    public Chat findById(Long id){
        return chatRepository.findById(id).orElse(null);
    }

    public Chat findByName(String name){
        return chatRepository.findByName(name).orElse(null);
    }

    public Iterable<Chat> findAll(){
        return chatRepository.findAll();
    }

    public void save(Chat chat){
        chatRepository.save(chat);
    }
}
