package org.example.useremployeef25b.config;

import org.example.useremployeef25b.model.Employee;
import org.example.useremployeef25b.model.Gender;
import org.example.useremployeef25b.model.User;
import org.example.useremployeef25b.repository.EmployeeRepository;
import org.example.useremployeef25b.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        if (userRepository.count() == 0) {
            User us1 = new User();
            us1.setEmail("jens@hej.dk");
            us1.setPassword("1234");
            userRepository.save(us1);

            Employee emp1 = new Employee();
            emp1.setBorn(LocalDateTime.of(1990, 5,10,16,10,12));
            emp1.setName("Jens");
            emp1.setGender(Gender.OTHER);
            emp1.setVegetarian(false);
            emp1.setUser(us1);
            employeeRepository.save(emp1);

            User us2 = new User();
            us2.setEmail("kurt@hej.dk");
            us2.setPassword("1234");
            userRepository.save(us2);

            Employee emp2 = new Employee();
            emp2.setBorn(LocalDateTime.of(1990, 5,10,16,10,12));
            emp2.setName("Kurt");
            emp2.setGender(Gender.OTHER);
            emp2.setVegetarian(false);
            emp2.setUser(us2);
            employeeRepository.save(emp2);

        }


    }
}
