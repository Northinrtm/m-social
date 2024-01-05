package com.github.northinrtm.msocial.service;

import com.github.northinrtm.msocial.dto.DailyDomainDto;
import com.github.northinrtm.msocial.mapper.DailyDomainMapper;
import com.github.northinrtm.msocial.repository.DailyDomainRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class DailyDomainService {

    private final DailyDomainRepository dailyDomainRepository;
    private final DailyDomainMapper dailyDomainMapper;

    public void saveDataFromBackorder(DailyDomainDto[] dailyDomainDtos) {
        dailyDomainRepository.deleteAll();
        for (DailyDomainDto dailyDomainDto : dailyDomainDtos) {
            dailyDomainRepository.save(dailyDomainMapper.mapToDailyDomain(dailyDomainDto));
        }
        log.info("database updated");
    }

    public long getCount() {
        return dailyDomainRepository.count();
    }

}
