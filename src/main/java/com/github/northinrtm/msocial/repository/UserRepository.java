package com.github.northinrtm.msocial.repository;

import com.github.northinrtm.msocial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByChatId(long chatId);

    @Query(value = "SELECT chat_id FROM users", nativeQuery = true)
    List<Long> getAllChatId();
}
