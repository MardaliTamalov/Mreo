package com.example.clientmreo.dto;

import com.example.clientmreo.entity.Owner;
import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OwnerCarDto {
    @Pattern(regexp = "[A-Z]([A-Z]|[a-z])+",message = "Имя должно состоять только из букв, первая большая")
    @Size(min=2,max=15,message = "имя долна содержать от 2 до 15 букв")
    private String name;

    @Pattern(regexp = "[A-Z]([A-Z]|[a-z])+",message = "Фамилия должно состоять только из букв, первая большая")
    @Size(min=2,max=15,message = "фамилия долна содержать от 2 до 15 букв")
    private String surname;


    @NotNull
    @Past
    private LocalDate dataOfBirch;

    @Pattern(regexp = "[A-Z]{3}\\d{3}[A-Z]{2}\\d{2}",message = "номер водительского удостоверения номер должен формата " +
            "3 заглавные буквы 3 цифры 2 заглавные буквы 2 цифры")
    private String numberDriveLicence;

    @NotNull
    @NotBlank
    private String brand;

    @NotNull
    @NotBlank
    private String model;

    @Min(value = 1922, message = "дата должна содержать цифры год выпуска 1922-2022")
    @Max(value =2022, message = "дата должна содержать цифры год выпуска 1922-2022")
    private int releaseYear;

    @Pattern(regexp = "[A-Z]{3}\\d{10}",message = "номер должен формата 3 заглавные буквы и цифры")
            private String vinNumber;
}
