package com.example.clientinsurance.repository;

import com.example.clientinsurance.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Long> {

Optional<Insurance> getInsuranceByNumberOfTheCar(String numberCar);
}
