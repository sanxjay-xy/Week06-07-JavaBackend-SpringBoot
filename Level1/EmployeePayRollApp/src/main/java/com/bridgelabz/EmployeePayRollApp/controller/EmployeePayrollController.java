package com.bridgelabz.EmployeePayRollApp.controller;

import com.bridgelabz.EmployeePayRollApp.model.Employee;
import com.bridgelabz.EmployeePayRollApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    private final EmployeeService service;

    public EmployeePayrollController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee e) {
        return service.save(e);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee e) {
        return service.update(e);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}