package com.springcore.collections;

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
        ApplicationContext cxt = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
        Emp emp = (Emp)cxt.getBean("employee1");
        System.out.println(emp);
    }
}
