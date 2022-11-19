package com.example.clientmreo.dto;

import com.example.clientmreo.entity.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OwnerCarDto {
    private String name;
    private String surname;
    private String dataOB;
    private String numberDriveLicence;

    private String brand;
    private String model;
    private int releaseYear;
    private String vinNumber;




}
