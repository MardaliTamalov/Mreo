package com.example.clientmreo.service.impl;

import com.example.clientmreo.dto.OwnerCarDto;
import com.example.clientmreo.mapper.MreoMapper;
import com.example.clientmreo.repository.OwnerRepository;
import com.example.clientmreo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor

public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final MreoMapper mreoMapper;

    @Override
    @Transactional
    public void updateOwner(OwnerCarDto ownerCarDto) {
        if (ownerRepository.getOwnerByNumberDriveLicence(ownerCarDto.getNumberDriveLicence()).isEmpty()) {
            ownerRepository.save(mreoMapper.getOwner(ownerCarDto));
        }
    }
}
