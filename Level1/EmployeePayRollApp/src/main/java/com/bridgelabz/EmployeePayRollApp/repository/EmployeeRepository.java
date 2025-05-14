package com.bridgelabz.EmployeePayRollApp.repository;

import com.bridgelabz.EmployeePayRollApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}