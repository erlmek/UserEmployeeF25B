package org.example.useremployeef25b.controller;

import org.example.useremployeef25b.model.Employee;
import org.example.useremployeef25b.model.User;
import org.example.useremployeef25b.repository.EmployeeRepository;
import org.example.useremployeef25b.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        System.out.println(user);
        return userRepository.save(user);
    }


}
