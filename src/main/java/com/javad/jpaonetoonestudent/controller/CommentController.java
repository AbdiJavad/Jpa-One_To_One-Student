package com.javad.jpaonetoonestudent.controller;

import com.javad.jpaonetoonestudent.model.Comment;
import com.javad.jpaonetoonestudent.repository.CommentRepository;
import com.javad.jpaonetoonestudent.repository.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/{studentId}/comments")

    public Comment save(Long studentId,Comment comment) throws Exception {
        Comment comment1=studentRepository.findById(studentId).map(student -> {
            comment.setStudent(student);
            return commentRepository.save(comment);
        }).orElseThrow(() -> new Exception("Not Found"));
        return comment1;
    }
    @GetMapping("/{studentId}/comments")
    public List<Comment> findAllCommentByStudent(@PathVariable("studentId") Long studentId) throws Exception {
        if (!studentRepository.existsById(studentId))
        throw new Exception("Not Found");
        return commentRepository.findByStudentId(studentId);
    }

}
