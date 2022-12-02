package com.example.clientdps.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "type_of_penalty")

public class TypeOfPenalty {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name = "type_of_penalty_id")
    private Long typeOfPenaltyId;

    @Column (name = "type_of_penalty")
    private String typeOfPenalty;

    @Column (name="fine_amount")
    private int fineAmount;



}
