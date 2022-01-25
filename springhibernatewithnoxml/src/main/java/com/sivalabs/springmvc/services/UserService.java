package com.sivalabs.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivalabs.springmvc.entities.User;
import com.sivalabs.springmvc.repositories.UserRepository;

/**
 * @author SivaLabs
 *
 */

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getAllUsers()
    {
        return this.userRepository.getAllUsers();
    }
    
    public Integer createUser(User user)
    {
        return this.userRepository.createUser(user);
    }
}