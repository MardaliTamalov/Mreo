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
    @Column (name = "fines_id")
    private Long id;

    @Column (name = "type_Of_penalty")
    private String typeOfPenalty;

    @Column (name="fine_amount")
    private int fineAmount;



}
