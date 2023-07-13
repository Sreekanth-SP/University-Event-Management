package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentId;

    @Pattern(regexp = "^[A-Z].*", message = "Name should start with a capital letter")
    private String firstName;
    private String lastName;

    @Min(value = 18,message = "Age should be 18 or more")
    @Max(value = 25,message = "Age Should be 25 or below")
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Department dept;


}
