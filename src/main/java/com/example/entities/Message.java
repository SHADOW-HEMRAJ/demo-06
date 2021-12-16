package com.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private String messageId;
    private String txtMessage;
    private String review;

    public Message(String messageId, String txtMessage) {
        this.messageId = messageId;
        this.txtMessage = txtMessage;
    }
    public Message(String messageId, String txtMessage,String review) {
        this.messageId = messageId;
        this.txtMessage = txtMessage;
        this.review=review;
    }

}
