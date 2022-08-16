package com.example.springrestfulpratice.Exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super(id + " is not found");
    }
}
