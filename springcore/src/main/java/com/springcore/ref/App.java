package com.springcore.ref;

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
        ApplicationContext cxt = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		
		 A a = (A)cxt.getBean("aref");
		 System.out.println(a);
		 
    }
}
