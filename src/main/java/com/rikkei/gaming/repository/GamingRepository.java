package com.rikkei.gaming.repository;

import com.rikkei.gaming.entity.GamingGear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GamingRepository extends JpaRepository<GamingGear, Long> {
    List<GamingGear> findByIsDeletedFalse();

    Optional<GamingGear> findByIdAndIsDeletedFalse(Long id);
}