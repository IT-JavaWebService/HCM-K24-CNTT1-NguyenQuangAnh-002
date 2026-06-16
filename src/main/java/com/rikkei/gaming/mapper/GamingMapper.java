package com.rikkei.gaming.mapper;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import java.util.List;

public interface GamingMapper {
    GamingDto toDto(GamingGear gamingGear);
    GamingGear toEntity(GamingDto gamingDto);
    List<GamingDto> toListDtos(List<GamingGear> gamingGears);
}