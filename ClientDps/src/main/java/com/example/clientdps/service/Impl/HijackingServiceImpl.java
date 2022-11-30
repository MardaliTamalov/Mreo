package com.example.clientdps.service.Impl;

import com.example.clientdps.repository.HijackingRepository;
import com.example.clientdps.service.HijackingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor

public class HijackingServiceImpl implements HijackingService {
    private final HijackingRepository hijackingRepository;

    @Override
    @Transactional
    public boolean checkHijacking(String vinNumber) {
        if (hijackingRepository.getHijackingsByVinNumber(vinNumber).isPresent()) {
            return hijackingRepository.getHijackingsByVinNumber(vinNumber).get().getReturnDate() != null;
        }
        return true;
    }
}
