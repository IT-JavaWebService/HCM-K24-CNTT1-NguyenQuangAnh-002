package com.rikkei.gaming.mapper.impl;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import com.rikkei.gaming.exception.GearNotFoundException;
import com.rikkei.gaming.mapper.GamingMapper;
import com.rikkei.gaming.repository.GamingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GamingMapperImpl implements GamingMapper {

    private GamingRepository gamingRepository;

    @Override
    public List<GamingDto> toListDtos(GamingDto gamingDto) {
        List<GamingDto> gamingGearDto = gamingRepository.findAll();

        gamingDto.setId(gamingDto.getId());
        gamingDto.setProduct_name(gamingDto.getProduct_name());
        gamingDto.setSeria_code(gamingDto.getSeria_code());
        gamingDto.setPrice(gamingDto.getPrice());
        gamingDto.set_deleted(gamingDto.is_deleted());
        gamingGearDto.stream().toList();
        return gamingRepository.findAll();
    }

    @Override
    public GamingDto toDto(GamingGear gamingGear) {
        Optional<GamingDto> gamingDto = gamingRepository.findById(1L);
        if(gamingDto.isPresent()) {
            GamingDto gamingDto1 = new GamingDto();
            return gamingDto1;
        }
        gamingGear.setId(gamingGear.getId());
        gamingGear.setProduct_name(gamingGear.getProduct_name());
        gamingGear.setSeria_code(gamingGear.getSeria_code());
        gamingGear.set_deleted(gamingGear.is_deleted());

        return gamingRepository.getReferenceById(1L);
    }

    @Override
    public GamingGear toEntity(GamingDto entities) {
        List<GamingDto> gamingGear = gamingRepository.findAll().stream().toList();

        entities.setId(entities.getId());
        entities.setProduct_name(entities.getProduct_name());
        entities.setSeria_code(entities.getSeria_code());
        entities.set_deleted(entities.is_deleted());
        gamingGear.stream().toList();
        return gamingRepository.findAll().stream().toList();
    }
}
