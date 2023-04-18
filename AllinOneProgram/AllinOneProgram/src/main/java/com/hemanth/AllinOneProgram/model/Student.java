package com.hemanth.AllinOneProgram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int  usn;

    @NotNull(message = "Name is mandatory")

    String name;

    @NotNull
    @NotBlank
    String branch;

    @NotNull(message = "email cannot be null")
    @NotBlank
    String email;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="student_uid")
//    private University university;

}

