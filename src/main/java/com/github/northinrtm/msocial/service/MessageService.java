package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.repository.MessagesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessagesRepository messagesRepository;
}
