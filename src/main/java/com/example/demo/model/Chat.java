package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chats")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("chat_id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "chat_id")
    private List<Message> messages;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    public Chat(){

    }

    public Long getId() {
        return id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
