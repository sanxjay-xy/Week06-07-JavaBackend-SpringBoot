package com.bridgelabz.AddressBook.dto;

import jakarta.validation.constraints.*;

public class AddressBookDTO {
    @NotEmpty(message = "Name cannot be empty")
    public String name;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone must be 10 digits")
    public String phone;

    @Email(message = "Email is invalid")
    public String email;

    @NotEmpty(message = "Address is required")
    public String address;
}