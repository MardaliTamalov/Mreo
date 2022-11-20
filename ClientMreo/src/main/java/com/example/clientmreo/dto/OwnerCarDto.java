package com.example.clientmreo.dto;

import com.example.clientmreo.entity.Owner;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OwnerCarDto {
    @Pattern(regexp = "[A-Z]([A-Z]|[a-z])+",message = "Имя должно состоять только из букв, первая большая")
    @Size(min=2,max=15,message = "")
    private String name;

    @Pattern(regexp = "[A-Z]([A-Z]|[a-z])+",message = "Фамилия должно состоять только из букв, первая большая")
    @Size(min=2,max=15,message = "")
    private String surname;

    @Pattern(regexp = "[1-31]\\.[1-12]\\.[1950-2004]",message = "дата должна содержать цифры фомата день.месяц.год")
    private String dataOB;

    @Pattern(regexp = "[A-Z]{3}\\d{3}[A-Z]{2}\\d{2}",message = "номер водительского удостоверения номер должен формата " +
            "3 заглавные буквы 3 цифры 2 заглавные буквы 2 цифры")
    private String numberDriveLicence;

    @NotNull
    @NotBlank
    private String brand;

    @NotNull
    @NotBlank
    private String model;

    @Pattern(regexp = "[1922-2022]",message = "дата должна содержать цифры год выпуска")
    private int releaseYear;

    @Pattern(regexp = "[A-Z]{3}[0–9]+",message = "номер водительского удостоверения номер должен формата ")
            private String vinNumber;




}
