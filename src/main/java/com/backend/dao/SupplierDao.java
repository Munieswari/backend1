package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.Supplier;

@ComponentScan("com")
@Repository
public interface SupplierDao {
	public void addSupplier(Supplier supplier);

}
