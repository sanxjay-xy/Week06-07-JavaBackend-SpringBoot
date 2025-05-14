package com.bridgelabz.EmployeePayRollApp.service;

import com.bridgelabz.EmployeePayRollApp.model.Employee;
import com.bridgelabz.EmployeePayRollApp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employee save(Employee e) {
        return repo.save(e);
    }

    public Employee update(Employee e) {
        return repo.save(e);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}