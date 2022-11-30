package com.example.clientdps.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hijacking")

public class Hijacking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "hijacking_id")
    private Long id;

    @Column (name = "date_penalty")
    private LocalDate datePenalty;

    @Column (name = "return_date")
    private LocalDate returnDate;

    @Column (name = "vin_number")
    private String vinNumber;


}
