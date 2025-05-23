package com.bridgelabz.AddressBook.service;

import com.bridgelabz.AddressBook.dto.AddressBookDTO;
import com.bridgelabz.AddressBook.exception.AddressBookException;
import com.bridgelabz.AddressBook.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService implements IAddressBookService {
    private List<AddressBookData> list = new ArrayList<>();
    private int idCounter = 1;

    public List<AddressBookData> getAll() {
        return list;
    }

    public AddressBookData getById(int id) {
        return list.stream().filter(e -> e.getId() == id).findFirst()
                .orElseThrow(() -> new AddressBookException("ID not found: " + id));
    }

    public AddressBookData create(AddressBookDTO dto) {
        AddressBookData data = new AddressBookData(idCounter++, dto);
        list.add(data);
        return data;
    }

    public AddressBookData update(int id, AddressBookDTO dto) {
        AddressBookData data = this.getById(id);
        data.setName(dto.name);
        data.setPhone(dto.phone);
        data.setEmail(dto.email);
        data.setAddress(dto.address);
        return data;
    }

    public void delete(int id) {
        AddressBookData data = this.getById(id);
        list.remove(data);
    }
}