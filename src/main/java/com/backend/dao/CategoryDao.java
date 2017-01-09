package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.Category;

@ComponentScan("com")
@Repository
public interface CategoryDao {
public	void addCategory(Category category);

}
