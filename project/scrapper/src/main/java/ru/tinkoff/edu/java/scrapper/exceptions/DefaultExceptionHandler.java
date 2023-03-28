package ru.tinkoff.edu.java.scrapper.exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;

@RestControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ApiErrorResponse> handleException(Exception ex) {
        ApiErrorResponse badResponse = new ApiErrorResponse(
                "Error",
                "400",
                ex.getClass().getName(),
                ex.getMessage(),
                (String[]) Arrays.stream(ex.getStackTrace()).map(StackTraceElement::toString).toArray()
        );
        return ResponseEntity.badRequest().body(badResponse);
    }
}
