package com.bridgelabz.AddressBook.model;

import com.bridgelabz.AddressBook.dto.AddressBookDTO;

public class AddressBookData {
    private int id;
    private String name;
    private String city;

    public AddressBookData(int id, AddressBookDTO dto) {
        this.id = id;
        this.name = dto.name;
        this.city = dto.city;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
}