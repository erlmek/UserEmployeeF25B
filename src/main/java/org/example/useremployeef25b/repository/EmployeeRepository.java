package org.example.useremployeef25b.repository;

import org.example.useremployeef25b.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findEmployeeByName(String name);
}
