package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.repository.DailyDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DailyDomainService {

    private final DailyDomainRepository dailyDomainRepository;
}
