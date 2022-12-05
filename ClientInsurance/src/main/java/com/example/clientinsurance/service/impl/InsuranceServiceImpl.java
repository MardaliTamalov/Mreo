package com.example.clientinsurance.service.impl;

import com.example.clientinsurance.repository.InsuranceRepository;
import com.example.clientinsurance.service.InsuranceService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor

public class InsuranceServiceImpl implements InsuranceService {
   private  final InsuranceRepository insuranceRepository;
    @Override
    @Transactional
    public boolean checkInsurance(String numberCar) {
        if (insuranceRepository.getInsuranceByNumberOfTheCar(numberCar).isPresent()) {
            return insuranceRepository.getInsuranceByNumberOfTheCar(numberCar).get().getEndDateOfInsurance().isAfter(LocalDate.now());
        }
        return false;
    }
}
