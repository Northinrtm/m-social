package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.entity.Message;
import com.github.northinrtm.msocial.entity.User;
import com.github.northinrtm.msocial.repository.MessagesRepository;
import com.github.northinrtm.msocial.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessagesRepository messagesRepository;
    private final UserRepository userRepository;

    public void createMessage(String request, String response, long userChatId) {
        Optional<User> userOptional = userRepository.findByChatId(userChatId);
        if (userOptional.isPresent()) {
            Message message = new Message();
            message.setRequest(request);
            message.setResponse(response);
            message.setUser(userOptional.get());
            messagesRepository.save(message);
        }
    }
}
