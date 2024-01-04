package com.github.northinrtm.msocial.mapper;

import com.github.northinrtm.msocial.dto.DailyDomainDto;
import com.github.northinrtm.msocial.entity.DailyDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DailyDomainMapper {
    DailyDomain toEntityFromDto(DailyDomainDto dailyDomainDto);
}
