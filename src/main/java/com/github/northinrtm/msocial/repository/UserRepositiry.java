package com.github.northinrtm.msocial.repository;

import com.github.northinrtm.msocial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiry extends JpaRepository<User, Long> {
}
