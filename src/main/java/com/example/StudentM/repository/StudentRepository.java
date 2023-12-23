package com.example.StudentM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentM.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
