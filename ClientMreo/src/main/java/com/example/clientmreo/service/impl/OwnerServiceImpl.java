package com.example.clientmreo.service.impl;

import com.example.clientmreo.dto.OwnerCarDto;
import com.example.clientmreo.mapper.MreoMapper;
import com.example.clientmreo.repository.OwnerRepository;
import com.example.clientmreo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final MreoMapper mreoMapper;

    @Override
    public void updateOwner(OwnerCarDto ownerCarDto) {
        if (ownerRepository.getOwnerByNumberDriveLicence(ownerCarDto.getNumberDriveLicence()).isEmpty()) {
            ownerRepository.save(mreoMapper.getOwner(ownerCarDto));
        }
    }
}
