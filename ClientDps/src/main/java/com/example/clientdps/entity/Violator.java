package com.example.clientdps.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "violator")

public class Violator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @Column (name = "date_of_violation")
    private LocalDate dateOfViolation;

    @Column (name = "number_of_the_car")
    private String numberOfTheCar;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn (name = "fines_id")
    private TypeOfPenalty typeOfPenalty;

}
