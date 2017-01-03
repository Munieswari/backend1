package com.backend.backend1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfiguration;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(ApplicationConfiguration.class);


    }
}
