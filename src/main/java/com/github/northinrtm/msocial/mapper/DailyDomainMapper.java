package com.github.northinrtm.msocial.mapper;

import com.github.northinrtm.msocial.dto.DailyDomainDto;
import com.github.northinrtm.msocial.entity.DailyDomain;
import org.springframework.stereotype.Component;

@Component
public class DailyDomainMapper {

    public DailyDomain mapToDailyDomain(DailyDomainDto dto) {
        DailyDomain domain = new DailyDomain();
        domain.setDomainName(dto.getDomainName());
        domain.setHotness(dto.getHotness());
        domain.setPrice(dto.getPrice());
        domain.setXValue(dto.getXValue());
        domain.setYandexTic(dto.getYandexTic());
        domain.setLinks(dto.getLinks());
        domain.setVisitors(dto.getVisitors());
        domain.setRegistrar(dto.getRegistrar());
        domain.setOld(dto.getOld());
        domain.setDeleteDate(dto.getDeleteDate());
        domain.setRkn(dto.isRkn());
        domain.setJudicial(dto.isJudicial());
        domain.setBlock(dto.isBlock());
        return domain;
    }
}
