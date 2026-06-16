package com.rikkei.gaming.service;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;

import java.util.List;
import java.util.Optional;

public interface GamingService {
    List<GamingDto> getAllGear();
    Optional<GamingDto> getGearById(Long id);
    GamingDto updateGear(Long id, GamingGear gaming);
    GamingDto updatePartGear(Long id, GamingGear gamingGear);
    GamingDto addGear(GamingGear gaming);
    boolean deletedGearById(Long id);
}
