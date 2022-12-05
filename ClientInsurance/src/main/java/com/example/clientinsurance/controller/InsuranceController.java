package com.example.clientinsurance.controller;

import com.example.clientinsurance.service.InsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance")
@RequiredArgsConstructor

public class InsuranceController {

    private final InsuranceService insuranceService;
    @GetMapping("/info-insurance/{numberCar}")
    public ResponseEntity<?> checkInsurance(@PathVariable String numberCar){
        if(insuranceService.checkInsurance(numberCar)){
            return  ResponseEntity.status(HttpStatus.OK).body(true);
        }
        return ResponseEntity.status(HttpStatus.OK).body(false);
    }


}
