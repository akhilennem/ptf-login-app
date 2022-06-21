package com.attendance.login.RestController.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "details")
public class Details {

    @Id
    public String email;
    @NotBlank
    @Size(max = 300)
    public String name;
    @Size(max = 200)
    public String phone;
    @Size(max = 600)
    public String address;
    @Size(max = 200)
    public String designation;

//    public Details(int id, String name, String email, String phone, String address, String designation) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//        this.designation = designation;
    }

