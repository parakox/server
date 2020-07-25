package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("message_id")
    private Long id;

    @Column(name = "user_name")
    @JsonProperty("user_name")
    private String userName;

    @Column(name = "chat_id")
    @JsonProperty("chat_id")
    private Long chatId;

    @Column(name = "text")
    @JsonProperty("text")
    private String text;

    public Message(){

    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getUserName() {
        return userName;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }
}
