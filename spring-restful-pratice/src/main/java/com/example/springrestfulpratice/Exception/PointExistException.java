package com.example.springrestfulpratice.Exception;

public class PointExistException extends RuntimeException {
    public PointExistException(int id) {
        super(id + " is exist");
    }
}
