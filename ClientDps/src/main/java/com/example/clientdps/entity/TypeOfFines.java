package com.example.clientdps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "typeOfFines")

public class TypeOfFines {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name = "fines_id")
    private Long id;



}
