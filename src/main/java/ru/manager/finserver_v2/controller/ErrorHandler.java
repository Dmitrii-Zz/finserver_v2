package ru.manager.finserver_v2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.manager.finserver_v2.model.except.ErrorResponse;
import ru.manager.finserver_v2.model.except.UserNotFoundException;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleUserNotFoundException(final UserNotFoundException e) {
        log.debug("Произошла ошибка {}", e.getMessage(), e);
        return new ErrorResponse(e.getMessage());
    }
}
