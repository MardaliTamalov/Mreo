package com.example.clientdps.service.Impl;

import com.example.clientdps.repository.ViolatorRepository;
import com.example.clientdps.service.ViolatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor

public class ViolatorServiceImpl implements ViolatorService {

    private  final ViolatorRepository violatorRepository;

    @Override
    @Transactional
    public boolean checkViolator(String numberCar) {

        return violatorRepository.getViolatorsByNumberOfTheCar(numberCar).isEmpty();
    }
}
