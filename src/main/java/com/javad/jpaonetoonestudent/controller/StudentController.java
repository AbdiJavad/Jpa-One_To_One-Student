package com.javad.jpaonetoonestudent.controller;

import com.javad.jpaonetoonestudent.model.Student;
import com.javad.jpaonetoonestudent.repository.StudentCourseRepository;
import com.javad.jpaonetoonestudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @PostMapping
    public Student sava(@RequestBody Student student){
        return studentRepository.save(student);

    }
}
