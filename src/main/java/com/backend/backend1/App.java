package com.backend.backend1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfiguration;
<<<<<<< HEAD
=======
import com.backend.dao.ProductDao;
import com.backend.dao.UsersDao;
import com.backend.model.Product;
import com.backend.model.Users;

>>>>>>> backend project

public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(ApplicationConfiguration.class);


=======
    	AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //annotationConfigApplicationContext.refresh();
    	UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
    	Users user=new Users();
    	user.setUsername("kk");
        user.setPassword("kk");
		userDao.registerUser(user);
		
		ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("ProductDaoImpl");
		 Product product=new Product();
		 product.setPname("eshu");
		 product.setPrice(960.0f);
		 p.addProduct(product);
		 
    
>>>>>>> backend project
    }
}
