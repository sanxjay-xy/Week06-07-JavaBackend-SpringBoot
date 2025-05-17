package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.model.EmployeePayrollData;
import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getAll();
    EmployeePayrollData getById(int empId);
    EmployeePayrollData create(EmployeePayrollDTO dto);
    EmployeePayrollData update(int empId, EmployeePayrollDTO dto);
    void delete(int empId);
}