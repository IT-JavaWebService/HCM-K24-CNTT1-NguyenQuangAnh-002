package com.rikkei.gaming.service.impl;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import com.rikkei.gaming.mapper.GamingMapper;
import com.rikkei.gaming.repository.GamingRepository;
import com.rikkei.gaming.service.GamingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GamingServiceImpl implements GamingService {

    private GamingRepository gamingRepository;

    private GamingMapper gamingMapper;

    @Override
    public List<GamingDto> getAllGear() {

        return gamingRepository.findAll();
    }

    @Override
    public Optional<GamingDto> getGearById(Long id) {
        Optional<GamingDto> gamingDto = gamingRepository.findById(id);
        if(gamingDto.isPresent()) {
            return gamingDto.stream().toList();
        }
        return gamingDto.map();
    }

    @Override
    public GamingDto addGear(GamingGear gaming) {
        return null;
    }

    @Override
    public GamingDto updateGear(Long id, GamingGear gaming){
        return null;
    }

    @Override
    public GamingDto updatePartGear(Long id, GamingGear gamingGear) {
        return null;
    }

    @Override
    public boolean deletedGearById(Long id) {
        return false;
    }
}
