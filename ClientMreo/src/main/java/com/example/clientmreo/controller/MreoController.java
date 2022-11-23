package com.example.clientmreo.controller;

import com.example.clientmreo.dto.OwnerCarDto;
import com.example.clientmreo.entity.Car;
import com.example.clientmreo.repository.CarRepository;
import com.example.clientmreo.service.MreoService;
import com.example.clientmreo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/mreo")
@RequiredArgsConstructor
public class MreoController {

    private final MreoService mreoService;

    @PostMapping("/registration")
    public ResponseEntity<?> registration(@Valid @RequestBody OwnerCarDto ownerCarDto) {
        mreoService.registration(ownerCarDto);
        return ResponseEntity.ok("ok");
    }
}
