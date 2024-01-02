package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.repository.UserRepositiry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepositiry userRepositiry;

}
