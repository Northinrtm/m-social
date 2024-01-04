package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.entity.User;
import com.github.northinrtm.msocial.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> findByChatId(long chatId) {
        return userRepository.findByChatId(chatId);
    }

    public void createUser(long chatId){
        User user = new User(chatId, Instant.now());
        userRepository.save(user);
    }

    public void updateMessageDate(User user){
        user.setLastMessageAt(Instant.now());
        userRepository.save(user);
    }
}
