package com.bridgelabz.AddressBook.exception;

import com.bridgelabz.AddressBook.dto.ResponseDTO;
import org.springframework.http.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleValidation(MethodArgumentNotValidException ex) {
        String err = ex.getBindingResult().getAllErrors().stream()
                .map(e -> e.getDefaultMessage()).collect(Collectors.joining(", "));
        return new ResponseEntity<>(new ResponseDTO("Validation Failed", err), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<ResponseDTO> handleCustom(AddressBookException ex) {
        return new ResponseEntity<>(new ResponseDTO("Error", ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> handleOther(Exception ex) {
        return new ResponseEntity<>(new ResponseDTO("Internal Error", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}