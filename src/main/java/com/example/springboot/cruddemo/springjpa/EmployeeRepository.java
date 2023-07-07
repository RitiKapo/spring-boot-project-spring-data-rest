package com.example.springboot.cruddemo.springjpa;

import com.example.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// this will change the rest resource path
// this will now expose http://localhost:8080/data-rest/members
// 'members' instead of 'employees'
//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write any code as we get the
    // crud methods for free
}
