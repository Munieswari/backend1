package com.backend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Supplier;

@Repository("SupplierDaoImpl")
@Transactional
public class SupplierDaoImpl implements SupplierDao{
@Autowired
private SessionFactory sessionFactory;
public void addSupplier(Supplier supplier){
	Session session=sessionFactory.getCurrentSession();
	session.save(supplier);
	System.out.println("supplier saved");}
}
