package com.javad.jpaonetoonestudent.controller;

import com.javad.jpaonetoonestudent.model.Student;
import com.javad.jpaonetoonestudent.model.StudentCourses;
import com.javad.jpaonetoonestudent.repository.StudentCourseRepository;
import com.javad.jpaonetoonestudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("students")
public class StudentCourseController {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/{student_Id}/courses")
    public StudentCourses save(@PathVariable Long student_Id, @RequestBody StudentCourses studentCourses){
      Student student=studentRepository.findById(student_Id).get();
        studentCourses.setStudent(student);
        studentCourses.setCourse_name(studentCourses.course_name);
        return studentCourseRepository.save(studentCourses);

    }
}
