package com.github.northinrtm.msocial.scheduler;

import com.github.northinrtm.msocial.dto.DailyDomainDto;
import com.github.northinrtm.msocial.service.DailyDomainService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DailDomainScheduler {

    private final String backorder;
    private final DailyDomainService dailyDomainService;

    public DailDomainScheduler(@Value("${backorder.url}") String backorder,
                               DailyDomainService dailyDomainService) {
        this.backorder = backorder;
        this.dailyDomainService = dailyDomainService;
    }

    @Scheduled(fixedRate = 5000)
    public void fetchAndSaveDailyDomains() {
        RestTemplate restTemplate = new RestTemplate();
        DailyDomainDto[] dailyDomainArray = restTemplate.getForObject(backorder, DailyDomainDto[].class);
        dailyDomainService.saveDataFromBackorder(dailyDomainArray);
    }
}
