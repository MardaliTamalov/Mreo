package com.example.clientmreo.service.impl;

import com.example.clientmreo.dto.OwnerCarDto;
import com.example.clientmreo.service.CarService;
import com.example.clientmreo.service.MreoService;
import com.example.clientmreo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MreoServiceImpl implements MreoService {
    private final CarService carService;
    private final OwnerService ownerService;

    @Override
    public void registration(OwnerCarDto ownerCarDto) {
    ownerService.updateOwner(ownerCarDto);
    carService.updateCar(ownerCarDto);
    }
}
