package ru.tinkoff.edu.java.scrapper.exceptions;

public record ApiErrorResponse(
        String description,
        String code,
        String exceptionName,
        String exceptionMessage,
        String[] stacktrace
) {
}
