package com.rikkei.gaming.service.impl;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import com.rikkei.gaming.exception.GearNotFoundException;
import com.rikkei.gaming.mapper.GamingMapper;
import com.rikkei.gaming.repository.GamingRepository;
import com.rikkei.gaming.service.GamingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GamingServiceImpl implements GamingService {

    private final GamingRepository gamingRepository;
    private final GamingMapper gamingMapper;

    @Override
    public List<GamingDto> getAllGear() {
        List<GamingGear> gears = gamingRepository.findByIsDeletedFalse();
        return gamingMapper.toListDtos(gears);
    }

    @Override
    public GamingDto getGearById(Long id) {
        GamingGear gear = gamingRepository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new GearNotFoundException("Thiet bi voi ID " + id + " khong ton tai trên he thong"));
        return gamingMapper.toDto(gear);
    }

    @Override
    public GamingDto addGear(GamingDto gamingDto) {
        GamingGear gear = gamingMapper.toEntity(gamingDto);
        gear.setDeleted(false); 
        GamingGear savedGear = gamingRepository.save(gear);
        return gamingMapper.toDto(savedGear);
    }

    @Override
    public GamingDto updateGear(Long id, GamingDto gamingDto) {
        GamingGear existingGear = gamingRepository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new GearNotFoundException("Thiet bi voi ID " + id + " khong ton tai tren he thong"));

        existingGear.setProductName(gamingDto.getProductName());
        existingGear.setSeriaCode(gamingDto.getSeriaCode());
        existingGear.setPrice(gamingDto.getPrice());
        if (gamingDto.getType() != null) {
            existingGear.setType(GamingGear.Type.valueOf(gamingDto.getType().name()));
        }

        GamingGear updatedGear = gamingRepository.save(existingGear);
        return gamingMapper.toDto(updatedGear);
    }

    @Override
    public GamingDto updatePartGear(Long id, GamingDto gamingDto) {
        GamingGear existingGear = gamingRepository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new GearNotFoundException("Thiet bi voi ID " + id + " khong ton tai tren he thong"));

        if (gamingDto.getProductName() != null && !gamingDto.getProductName().isBlank()) {
            existingGear.setProductName(gamingDto.getProductName());
        }
        if (gamingDto.getSeriaCode() != null && !gamingDto.getSeriaCode().isBlank()) {
            existingGear.setSeriaCode(gamingDto.getSeriaCode());
        }
        if (gamingDto.getPrice() != null) {
            existingGear.setPrice(gamingDto.getPrice());
        }
        if (gamingDto.getType() != null) {
            existingGear.setType(GamingGear.Type.valueOf(gamingDto.getType().name()));
        }

        GamingGear updatedGear = gamingRepository.save(existingGear);
        return gamingMapper.toDto(updatedGear);
    }

    @Override
    public void deleteGearById(Long id) {
        GamingGear existingGear = gamingRepository.findByIdAndIsDeletedFalse(id)
                .orElseThrow(() -> new GearNotFoundException("Thiet bi voi ID " + id + " khong ton tai tren he thong"));

        existingGear.setDeleted(true);
        gamingRepository.save(existingGear);
    }
}