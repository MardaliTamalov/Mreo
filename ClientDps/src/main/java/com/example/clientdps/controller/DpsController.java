package com.example.clientdps.controller;

import com.example.clientdps.service.HijackingService;
import com.example.clientdps.service.ViolatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dps")
@RequiredArgsConstructor

public class DpsController {
    private final ViolatorService violatorService;
    private final HijackingService hijackingService;

    @GetMapping("/violator/{numberCar}")
    public ResponseEntity <?> infoViolator(@PathVariable String numberCar){
        if (violatorService.checkViolator(numberCar)){
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }
        return ResponseEntity.status(HttpStatus.OK).body(false);
    }

    @GetMapping("/hijacking/{vinNumber}")
    public ResponseEntity <?> infoHijacking(@PathVariable String vinNumber){
        if (hijackingService.checkHijacking(vinNumber)){
            return ResponseEntity.status(HttpStatus.OK).body(true);
        }
        return ResponseEntity.status(HttpStatus.OK).body(false);
    }

}
