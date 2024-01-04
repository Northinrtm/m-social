package com.github.northinrtm.msocial.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long chatId;

    private Instant lastMessageAt;

    public User(long chatId, Instant lastMessageAt) {
        this.chatId = chatId;
        this.lastMessageAt = lastMessageAt;
    }
}