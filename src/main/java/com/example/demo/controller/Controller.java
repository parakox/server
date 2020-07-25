package com.example.demo.controller;

import com.example.demo.model.Chat;
import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.service.ChatService;
import com.example.demo.service.MessageService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller{

    @Autowired
    private UserService userService;

    @Autowired
    private ChatService chatService;

    @Autowired
    private MessageService messageService;

    @GetMapping("/chatById")
    public Chat getChatById(@RequestParam("id") Long id){
        return chatService.findById(id);
    }

    @GetMapping("/chatByName")
    public Chat getChatByName(@RequestParam("name") String name){
        return chatService.findByName(name);
    }

    @PostMapping("/chat")
    public void updateChat(@RequestBody Chat chat){
        chatService.save(chat);
    }
    @PostMapping("/message")
    public void saveMessage(@RequestBody Message message){
        messageService.save(message);
    }

    @PostMapping("/user")
    public void updateUser(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/userById")
    public User getUserById(@RequestParam("id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/userByNickname")
    public User getUserByNickname(@RequestParam("nickname") String nickname){
        return userService.findByNickname(nickname);
    }

    @GetMapping("/chats")
    public Iterable<Chat> findChats(){
        return chatService.findAll();
    }
}
