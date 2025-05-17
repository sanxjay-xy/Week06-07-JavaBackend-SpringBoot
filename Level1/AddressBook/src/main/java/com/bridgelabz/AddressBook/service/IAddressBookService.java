package com.bridgelabz.AddressBook.service;

import com.bridgelabz.AddressBook.dto.AddressBookDTO;
import com.bridgelabz.AddressBook.model.AddressBookData;
import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAll();
    AddressBookData getById(int id);
    AddressBookData create(AddressBookDTO dto);
    AddressBookData update(int id, AddressBookDTO dto);
    void delete(int id);
}