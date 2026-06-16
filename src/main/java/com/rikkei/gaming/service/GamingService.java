package com.rikkei.gaming.service;

import com.rikkei.gaming.dto.GamingDto;
import java.util.List;

public interface GamingService {
    List<GamingDto> getAllGear();
    GamingDto getGearById(Long id);
    GamingDto addGear(GamingDto gamingDto);
    GamingDto updateGear(Long id, GamingDto gamingDto);
    GamingDto updatePartGear(Long id, GamingDto gamingDto);
    void deleteGearById(Long id);
}