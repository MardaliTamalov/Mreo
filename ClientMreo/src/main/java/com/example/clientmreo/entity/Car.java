package com.example.clientmreo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="car")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "car_id")
    private Long id;

    @Column(name= "car_brand")
    private String brand;

    @Column (name="car_model")
    private String model;

    @Column (name = "car_release_year")
    private int releaseYear;

    @Column(name= "car_vin_number")
    private String vinNumber;

    @ManyToOne(cascade = CascadeType.ALL)
       @JoinColumn(name = "owner_id")
    private Owner owner;


}
