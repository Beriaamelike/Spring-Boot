package com.mberiaayas.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DTOStudentUI {

    @NotEmpty(message = "isim bos birakilamaz!")
    @Min(value = 3 , message = "isim en az 2 karakter olmalidir!")
    @Max(value = 20, message= "isim en fazla 20 karakter olabilir!")
    private String firstName;

    @Size(min=3, max=20)
    private String lastName;

    private Date birthOfDate;

    @Email(message="Email formatında bir adres giriniz!")
    private String email;

    @Size(min = 11, max=11, message = "Tckn alanı 11 karakter olmalidir!")
    @NotEmpty(message = "Tckn alani bos gecilemez!")
    private String tckn;
}











