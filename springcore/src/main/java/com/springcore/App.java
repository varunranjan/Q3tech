package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "ello World!" );
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student)cxt.getBean("s1");
        System.out.println(s);
        
    }
}
