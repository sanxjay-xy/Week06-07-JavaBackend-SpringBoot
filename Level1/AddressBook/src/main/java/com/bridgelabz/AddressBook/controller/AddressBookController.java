package com.bridgelabz.AddressBook.controller;

import com.bridgelabz.AddressBook.dto.AddressBookDTO;
import com.bridgelabz.AddressBook.dto.ResponseDTO;
import com.bridgelabz.AddressBook.model.AddressBookData;
import com.bridgelabz.AddressBook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    private IAddressBookService service;

    @GetMapping("/")
    public ResponseEntity<ResponseDTO> getAll() {
        List<AddressBookData> list = service.getAll();
        return new ResponseEntity<>(new ResponseDTO("Fetched all", list), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getById(@PathVariable int id) {
        AddressBookData data = service.getById(id);
        return new ResponseEntity<>(new ResponseDTO("Fetched by ID", data), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@Valid @RequestBody AddressBookDTO dto) {
        AddressBookData data = service.create(dto);
        return new ResponseEntity<>(new ResponseDTO("Created", data), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable int id, @Valid @RequestBody AddressBookDTO dto) {
        AddressBookData data = service.update(id, dto);
        return new ResponseEntity<>(new ResponseDTO("Updated", data), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(new ResponseDTO("Deleted", "id: " + id), HttpStatus.OK);
    }
}