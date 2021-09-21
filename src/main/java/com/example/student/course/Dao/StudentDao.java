package com.example.student.course.Dao;

import com.example.student.course.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}
