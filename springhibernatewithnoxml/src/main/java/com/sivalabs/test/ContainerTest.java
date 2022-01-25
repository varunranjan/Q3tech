package com.sivalabs.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sivalabs.springmvc.entities.User;
import com.sivalabs.springmvc.services.UserService;

public class ContainerTest
{
    public static void main(String[] args)
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(com.sivalabs.springmvc.config.RepositoryConfig.class);
       // ctx.scan("com.sivalabs");//This will load the configured components UserService, UserRepository,
       // ctx.refresh();
        
       // System.out.println(ctx);
        UserService userService = ctx.getBean("userService", UserService.class);
        
        List<User> allUser = userService.getAllUsers();
        for (User u : allUser)
        {
            System.out.println("all user");
            System.out.println(u);
        }
        
        User user = new User(null, "Shashi Ranjan", "Bihar");
        Integer id = userService.createUser(user);
        System.out.println("Newly created User Id="+id);
        allUser = userService.getAllUsers();
        System.out.println("all user");
        for (User u : allUser)
        {
            System.out.println(u);
        }
    }

}