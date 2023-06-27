package com.javad.jpaonetoonestudent.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_courses")
public class StudentCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String course_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "student_id")
    private Student student;


}
