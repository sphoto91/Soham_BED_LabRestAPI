package com.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.Student;
import com.student.management.repository.StudentRepository;

@Service

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}

	@Override
	public List<Student> searchBy(String firstName, String lastName) {
		// TODO Auto-generated method stub
		List<Student> students =studentRepository.findByFirstNameContainsAndLastNameContainsAllIgnoreCase(firstName, lastName);
		return null;
	}

}
