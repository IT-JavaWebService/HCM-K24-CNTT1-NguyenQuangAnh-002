package com.rikkei.gaming.mapper.impl;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import com.rikkei.gaming.mapper.GamingMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GamingMapperImpl implements GamingMapper {

    @Override
    public GamingDto toDto(GamingGear gamingGear) {
        if (gamingGear == null) {
            return null;
        }
        GamingDto dto = new GamingDto();
        dto.setId(gamingGear.getId());
        dto.setProductName(gamingGear.getProductName());
        dto.setSeriaCode(gamingGear.getSeriaCode());
        dto.setPrice(gamingGear.getPrice());
        if (gamingGear.getType() != null) {
            dto.setType(GamingDto.Type.valueOf(gamingGear.getType().name()));
        }
        dto.setDeleted(gamingGear.isDeleted());
        return dto;
    }

    @Override
    public GamingGear toEntity(GamingDto dto) {
        if (dto == null) {
            return null;
        }
        GamingGear entity = new GamingGear();
        entity.setId(dto.getId());
        entity.setProductName(dto.getProductName());
        entity.setSeriaCode(dto.getSeriaCode());
        entity.setPrice(dto.getPrice());
        if (dto.getType() != null) {
            entity.setType(GamingGear.Type.valueOf(dto.getType().name()));
        }
        entity.setDeleted(dto.isDeleted());
        return entity;
    }

    @Override
    public List<GamingDto> toListDtos(List<GamingGear> gamingGears) {
        if (gamingGears == null) {
            return null;
        }
        return gamingGears.stream().map(this::toDto).collect(Collectors.toList());
    }
}