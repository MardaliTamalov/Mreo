package com.example.clientdps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "violator")

public class Violator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @Column (name = "dateOfViolation")
    private LocalDate dateOfViolation;

    @Column (name = "numberOfTheCar")
    private int numberOfTheCar;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn (name = "fines_id")
    private TypeOfPenalty typeOfPenalty;

}
