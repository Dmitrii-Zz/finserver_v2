package ru.manager.finserver_v2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.manager.finserver_v2.model.except.*;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({UserNotFoundException.class, BillNotFoundException.class, IncomeNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handlerNotFoundException(final Exception e) {
        log.debug("Произошла ошибка {}", e.getMessage(), e);
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler({NoAccessBillException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse handlerNoAccess(final Exception e) {
        log.debug("Произошла ошибка {}", e.getMessage(), e);
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationException(final Exception e) {
        log.debug("Ошибка валидации данных: {}", e.getMessage());
        return new ErrorResponse(e.getMessage());
    }
}