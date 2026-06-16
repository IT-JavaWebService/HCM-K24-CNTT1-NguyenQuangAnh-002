package com.rikkei.gaming.controller;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.repository.GamingRepository;
import com.rikkei.gaming.service.GamingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gaminggaer")
@RequiredArgsConstructor
public class GamingController {
    private final GamingRepository gamingRepository;

    private final GamingService gamingService;

    //api lấy danh sách GamingGear( có validate)
    @GetMapping
    public List<GamingDto> getAllGear(){
        return null;
    }

    @GetMapping("/{id}")
    public Optional<GamingDto> getGearById() {
        return null;
    }
    //api Them moi GamingGear(co validate)
    @PostMapping("/add")
    public GamingDto addGear() {
        return null;
    }
    //api cap nhat thong tin tat ca thiet bi(co validate)
    @PutMapping("/{id}")
    public GamingDto updateGear() {
        return null;
    }
    //api cap nhat thong tin thiet bi mot phan thong tin(co validate)
    @PatchMapping("/{id}")
    public GamingDto updatePartGear() {
        return null;
    }

    //api xoa thiet bi(Soft hoac Hard)
    @DeleteMapping("/{id}")
    public GamingDto deleteGear() {
        return null;
    }

}
