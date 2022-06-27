package com.attendance.login.RestController.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "asd")

public class User1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    public String para;
    private String phone;
    private LocalDate date=LocalDate.now();
    public String time;
}
