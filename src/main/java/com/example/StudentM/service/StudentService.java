package com.example.StudentM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentM.entity.Student;
import com.example.StudentM.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;
    
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public Student createStudent(Student s1) {
		// TODO Auto-generated method stub
		return studentRepository.save(s1);
		
	}

	public Student getStudent(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
		
	}

	public void deleteStudent(Integer studentId) {
		
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);;
		
	}

	public Student updateStudent(Integer studentId, Student s1) {
		// TODO Auto-generated method stub
		Student s2=studentRepository.findById(studentId).get();
		Integer id=s2.getId();
		s1.setId(id);
		studentRepository.save(s1);
		return s1;
	}
	

}
