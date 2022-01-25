package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
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
		
		  AbstractApplicationContext cxt = new
		  ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml"); Samosa
		  s = (Samosa)cxt.getBean("s1"); System.out.println(s);
		  cxt.registerShutdownHook();
		  System.out.println("..............................................."); Pepsi
		  p = (Pepsi)cxt.getBean("p1"); System.out.println(p);
		 
		  
        AnnotationExample a= (AnnotationExample)cxt.getBean("ae");
        System.out.println(a);
    }
}
