package com.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.management.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT u from User u where u.username=?1")
	
	User getUserByUsername(String username);

}
