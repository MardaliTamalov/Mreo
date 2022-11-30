package com.example.clientdps.repository;

import com.example.clientdps.entity.Violator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ViolatorRepository extends JpaRepository<Violator,Long> {

    List<Violator> getViolatorsByNumberOfTheCar (String numberCar);
}
