package com.example.springrestfulpratice.Advic;

import com.example.springrestfulpratice.Exception.NotFoundException;
import com.example.springrestfulpratice.Exception.PointExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvic {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> NotFound(NotFoundException notFoundException) {
        return ResponseEntity.ok(notFoundException.getMessage());
    }

    @ExceptionHandler(PointExistException.class)
    public ResponseEntity<String> PointExist(PointExistException pointExistException) {
        return ResponseEntity.ok(pointExistException.getMessage());
    }
}
