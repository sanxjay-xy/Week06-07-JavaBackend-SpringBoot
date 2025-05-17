package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.dto.*;
import com.bridgelabz.EmployeePayrollApp.model.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollApp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/")
    public ResponseEntity<ResponseDTO> getAll() {
        List<EmployeePayrollData> list = service.getAll();
        return new ResponseEntity<>(new ResponseDTO("Fetched all", list), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getById(@PathVariable int id) {
        EmployeePayrollData emp = service.getById(id);
        return new ResponseEntity<>(new ResponseDTO("Fetched by ID", emp), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@RequestBody EmployeePayrollDTO dto) {
        EmployeePayrollData emp = service.create(dto);
        return new ResponseEntity<>(new ResponseDTO("Created", emp), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable int id, @RequestBody EmployeePayrollDTO dto) {
        EmployeePayrollData emp = service.update(id, dto);
        return new ResponseEntity<>(new ResponseDTO("Updated", emp), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(new ResponseDTO("Deleted", "id: " + id), HttpStatus.OK);
    }
}