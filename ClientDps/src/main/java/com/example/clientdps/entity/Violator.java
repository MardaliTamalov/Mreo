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
    @Column(name= "violator_id")
    private Long id;

    @Column (name = "date_of_violator")
    private LocalDate dateOfViolation;

    @Column (name = "number_of_the_car")
    private String numberOfTheCar;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn (name = "type_of_penalty_id")
    private TypeOfPenalty typeOfPenalty;

}
