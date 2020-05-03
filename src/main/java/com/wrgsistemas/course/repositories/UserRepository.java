package com.wrgsistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrgsistemas.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
}
