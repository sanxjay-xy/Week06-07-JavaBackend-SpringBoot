package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.model.EmployeePayrollData;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    private List<EmployeePayrollData> empList = new ArrayList<>();
    private int idCounter = 1;

    public List<EmployeePayrollData> getAll() {
        return empList;
    }

    public EmployeePayrollData getById(int empId) {
        return empList.stream().filter(e -> e.getId() == empId).findFirst().orElse(null);
    }

    public EmployeePayrollData create(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(idCounter++, dto);
        empList.add(emp);
        return emp;
    }

    public EmployeePayrollData update(int empId, EmployeePayrollDTO dto) {
        EmployeePayrollData emp = this.getById(empId);
        if (emp != null) {
            emp.setName(dto.name);
            emp.setSalary(dto.salary);
        }
        return emp;
    }

    public void delete(int empId) {
        empList.removeIf(e -> e.getId() == empId);
    }
}