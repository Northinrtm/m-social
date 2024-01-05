package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.entity.User;
import com.github.northinrtm.msocial.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> findByChatId(long chatId) {
        return userRepository.findByChatId(chatId);
    }

    public void createUser(long chatId) {
        User user = new User(chatId, Instant.now());
        userRepository.save(user);
        log.info("user saved");
    }

    public void updateMessageDate(User user) {
        user.setLastMessageAt(Instant.now());
        userRepository.save(user);
        log.info("user's last access time updated");
    }

    public List<Long> getAllChatId() {
        return userRepository.getAllChatId();
    }
}
