package com.javad.jpaonetoonestudent.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name = "firstname")
    public String firstname;
    @Column(name = "lastname")
    public String lastname;
}
