package org.example.useremployeef25b.controller;

import org.example.useremployeef25b.model.Employee;
import org.example.useremployeef25b.model.User;
import org.example.useremployeef25b.repository.EmployeeRepository;
import org.example.useremployeef25b.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestControllerTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/userstest")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/employeestest")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
