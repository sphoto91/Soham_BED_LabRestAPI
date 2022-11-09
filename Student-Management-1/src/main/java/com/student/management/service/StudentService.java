package com.student.management.service;

import java.util.List;

import com.student.management.entities.Student;


public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);
	
	List<Student> searchBy(String firstName, String lastName);

}
