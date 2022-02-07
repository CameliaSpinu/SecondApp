package com.kspinu.springbootcrudwebthymeleaf.repository;

import com.kspinu.springbootcrudwebthymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
