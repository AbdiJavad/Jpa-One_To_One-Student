package com.javad.jpaonetoonestudent.repository;

import com.javad.jpaonetoonestudent.model.StudentCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourses,Long> {
}
