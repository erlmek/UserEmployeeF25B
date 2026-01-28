package org.example.useremployeef25b.model;

import org.example.useremployeef25b.repository.EmployeeRepository;
import org.example.useremployeef25b.repository.UserRepository;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.InvalidDataAccessApiUsageException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void findAtLeastOneJens(){
        List<Employee> lst = employeeRepository.findEmployeeByName("Jens");
        assertTrue(lst.size() > 0);
    }

    @Test
    void testDeleteUser() {
        List<Employee> lst = employeeRepository.findEmployeeByName("Jens");
        Employee emp1 = lst.get(0);
        assertEquals("Jens", emp1.getName());
        //userRepository.delete(emp1.getUser());
        assertThrows(InvalidDataAccessApiUsageException.class, () -> userRepository.delete(emp1.getUser()));
    }
}