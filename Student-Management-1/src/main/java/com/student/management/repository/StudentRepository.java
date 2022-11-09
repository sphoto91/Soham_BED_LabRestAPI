package com.student.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByFirstNameContainsAndLastNameContainsAllIgnoreCase(String firstName, String lastName);

}
