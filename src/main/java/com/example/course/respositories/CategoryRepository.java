package com.example.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
