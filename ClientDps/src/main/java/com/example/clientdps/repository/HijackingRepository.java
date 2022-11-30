package com.example.clientdps.repository;


import com.example.clientdps.entity.Hijacking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface HijackingRepository extends JpaRepository<Hijacking, Long> {
    Optional<Hijacking> getHijackingsByVinNumber (String vinNumber);
}