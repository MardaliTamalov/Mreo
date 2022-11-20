package com.example.clientmreo.service.impl;

import com.example.clientmreo.dto.OwnerCarDto;
import com.example.clientmreo.entity.Car;
import com.example.clientmreo.entity.Owner;
import com.example.clientmreo.mapper.MreoMapper;
import com.example.clientmreo.repository.CarRepository;
import com.example.clientmreo.repository.OwnerRepository;
import com.example.clientmreo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final MreoMapper mreoMapper;
    private final OwnerRepository ownerRepository;

    @Override
    @Transactional
    public void updateCar(OwnerCarDto ownerCarDto) {
        Owner owner = ownerRepository.getOwnerByNumberDriveLicence(ownerCarDto.getNumberDriveLicence())
                .orElse(mreoMapper.getOwner(ownerCarDto));
    Car car = carRepository.getCarByVinNumber(ownerCarDto.getVinNumber())
                    .orElse(mreoMapper.getCar(ownerCarDto));
        car.setOwner(owner);
        carRepository.save(car);

    }
}
