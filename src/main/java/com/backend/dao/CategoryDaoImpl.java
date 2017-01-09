package com.backend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Category;

@Repository("CategoryDaoImpl")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addCategory(Category category){
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		System.out.println("category saved");
	}

}
