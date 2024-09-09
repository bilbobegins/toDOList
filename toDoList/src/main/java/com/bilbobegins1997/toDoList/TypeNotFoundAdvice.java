package com.bilbobegins1997.toDoList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TypeNotFoundAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(TypeNotFoundException ex) {
        return ex.getMessage();
    }

}