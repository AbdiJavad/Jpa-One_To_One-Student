package com.javad.jpaonetoonestudent.repository;

import com.javad.jpaonetoonestudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
