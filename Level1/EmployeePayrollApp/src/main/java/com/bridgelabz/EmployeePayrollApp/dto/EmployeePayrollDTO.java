package com.bridgelabz.EmployeePayrollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name is invalid")
    public String name;

    @Min(value = 5000, message = "Salary should be at least 5000")
    public long salary;
}