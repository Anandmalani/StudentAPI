package com.example.StudentM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentM.entity.Student;
import com.example.StudentM.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

    @PostMapping
	public Student createStudent(@RequestBody Student s1) {
		return studentService.createStudent(s1);
		
		
	}
    @GetMapping("/{studentId}")
	public Student getStudent(@PathVariable Integer studentId) {
    	return studentService.getStudent(studentId);
		
	}
    @DeleteMapping
    public void deleteStudent(@PathVariable Integer studentId) {
    	studentService.deleteStudent(studentId);
    }
	
    @PutMapping("/{studentId}")
    public Student updateStudent(@PathVariable Integer studentId, @RequestBody Student s1) {
    	return studentService.updateStudent(studentId, s1);
    }

}
