package com.example.clientmreo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "owner")

public class Owner {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "owner_id")
    private Long id;

    @Column (name = "owner_name")
    private String name;

    @Column (name = "owner_surname")
    private String surname;

    @Column( name = "owner_dataOB")
    private LocalDate dataOfBirch;

    @Column (name = "owner_numberDL")
    private String numberDriveLicence ;

}
