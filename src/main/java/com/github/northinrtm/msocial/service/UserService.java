package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.entity.User;
import com.github.northinrtm.msocial.repository.UserRepositiry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepositiry userRepositiry;

    public Optional<User> findByChatId(long chatId) {
        return userRepositiry.findByChatId(chatId);
    }

    public void createUser(long chatId){
        User user = new User(chatId, Instant.now());
        userRepositiry.save(user);
    }

    public void updateMessageDate(User user){
        user.setLastMessageAt(Instant.now());
        userRepositiry.save(user);
    }
}
