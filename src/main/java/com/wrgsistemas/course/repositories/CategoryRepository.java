package com.wrgsistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrgsistemas.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
}
