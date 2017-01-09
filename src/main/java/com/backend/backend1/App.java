package com.backend.backend1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfiguration;
import com.backend.dao.CategoryDao;
import com.backend.dao.ProductDao;
import com.backend.dao.SupplierDao;
import com.backend.dao.UsersDao;
import com.backend.model.Category;
import com.backend.model.Product;
import com.backend.model.Supplier;
import com.backend.model.Users;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //annotationConfigApplicationContext.refresh();
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
        Users user=new Users();
        user.setUsername("test");
        user.setPassword("test");
        userDao.registerUser(user);
                  
        ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("ProductDaoImpl");
        Product product=new Product();
        product.setPname("test");
        product.setPrice(900.0f);
        p.addProduct(product);
        
        CategoryDao c=(CategoryDao)annotationConfigApplicationContext.getBean("CategoryDaoImpl");
        Category category=new Category();
        category.setCategoryName("Moto");
        c.addCategory(category);
        
        SupplierDao s=(SupplierDao)annotationConfigApplicationContext.getBean("SupplierDaoImpl");
        Supplier supplier=new Supplier();
        supplier.setsName("Moto");
        supplier.setsAddress("TPTY");
        s.addSupplier(supplier);
       
        
        
    	
		 
  
    }
}
