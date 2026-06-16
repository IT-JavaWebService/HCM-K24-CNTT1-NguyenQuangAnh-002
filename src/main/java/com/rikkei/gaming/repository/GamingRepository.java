package com.rikkei.gaming.repository;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.entity.GamingGear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamingRepository extends JpaRepository<GamingDto, Long> {
}
