package com.example.clientinsurance.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="insurance")

public class Insurance {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "insurance_id")
    private Long id;

    @Column(name = "insurance_number")
    private String insuranceNumber;

    @Column (name = "number_of_the_car")
    private String numberOfTheCar;

    @Column (name = "insurance_start_date")
    private LocalDate insuranceStartDate;

    @Column (name = "end_date_of_insurance")
    private LocalDate endDateOfInsurance;
}
