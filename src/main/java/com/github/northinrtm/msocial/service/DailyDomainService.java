package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.dto.DailyDomainDto;
import com.github.northinrtm.msocial.mapper.DailyDomainMapper;
import com.github.northinrtm.msocial.repository.DailyDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DailyDomainService {

    private final DailyDomainRepository dailyDomainRepository;
    private final DailyDomainMapper dailyDomainMapper;

    public void saveDataFromBackorder(DailyDomainDto[] dailyDomainDtos) {
        dailyDomainRepository.deleteAll();
        for (DailyDomainDto dailyDomainDto : dailyDomainDtos) {
            dailyDomainRepository.save(dailyDomainMapper.toEntityFromDto(dailyDomainDto));
        }
    }

}
