package com.rikkei.gaming.controller;

import com.rikkei.gaming.dto.GamingDto;
import com.rikkei.gaming.service.GamingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/gaminggear")
@RequiredArgsConstructor
public class GamingController {

    private final GamingService gamingService;

    @GetMapping
    public ResponseEntity<List<GamingDto>> getAllGear() {
        return ResponseEntity.ok(gamingService.getAllGear());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GamingDto> getGearById(@PathVariable Long id) {
        return ResponseEntity.ok(gamingService.getGearById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<GamingDto> addGear(@Valid @RequestBody GamingDto gamingDto) {
        return new ResponseEntity<>(gamingService.addGear(gamingDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GamingDto> updateGear(@PathVariable Long id, @Valid @RequestBody GamingDto gamingDto) {
        return ResponseEntity.ok(gamingService.updateGear(id, gamingDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<GamingDto> updatePartGear(@PathVariable Long id, @RequestBody GamingDto gamingDto) {
        return ResponseEntity.ok(gamingService.updatePartGear(id, gamingDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteGear(@PathVariable Long id) {
        gamingService.deleteGearById(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Xoa soft-delete thiet bi thanh cong!");
        return ResponseEntity.ok(response);
    }
}