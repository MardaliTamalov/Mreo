package com.example.clientdps.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "typeOfPenalty")

public class TypeOfPenalty {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name = "fines_id")
    private Long id;

    @Column (name = "typeOfPenalty")
    private String typeOfPenalty;

    @Column (name="fineAmount")
    private int fineAmount;



}
