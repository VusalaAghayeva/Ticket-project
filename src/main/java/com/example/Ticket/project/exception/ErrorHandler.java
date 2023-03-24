package com.example.Ticket.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(TicketNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) //400
    public ExceptionResponse handleTicketNotFoundException(TicketNotFoundException exception) {
        return new ExceptionResponse(400, exception.getMessage());
    }
}
