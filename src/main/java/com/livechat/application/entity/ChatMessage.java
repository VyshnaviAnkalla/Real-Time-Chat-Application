package com.livechat.application.entity;

import lombok.*;


public class ChatMessage {

    private Long id;
    private String sender;
    private String content;

    public ChatMessage() {
    }

    // All-Args Constructor
    public ChatMessage(Long id, String sender, String content) {
        this.id = id;
        this.sender = sender;
        this.content = content;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for sender
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    

}
