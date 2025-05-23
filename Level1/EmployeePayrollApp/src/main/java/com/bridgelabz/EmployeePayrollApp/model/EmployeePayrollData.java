package com.bridgelabz.EmployeePayrollApp.model;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    private int id;
    private String name;
    private long salary;

    public EmployeePayrollData(int id, EmployeePayrollDTO dto) {
        this.id = id;
        this.name = dto.name;
        this.salary = dto.salary;
    }

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(long salary) { this.salary = salary; }
    public String getName() { return name; }
    public long getSalary() { return salary; }
}