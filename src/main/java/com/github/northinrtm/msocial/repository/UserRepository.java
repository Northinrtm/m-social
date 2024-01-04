package com.github.northinrtm.msocial.repository;

import com.github.northinrtm.msocial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByChatId(long chatId);


}
