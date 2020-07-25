package com.example.demo.service;

import com.example.demo.model.Chat;

public interface ChatService {
    Chat findById(Long id);

    Chat findByName(String name);

    Iterable<Chat> findAll();

    void save(Chat chat);
}
