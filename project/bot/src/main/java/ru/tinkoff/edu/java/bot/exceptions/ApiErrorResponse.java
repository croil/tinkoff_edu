package ru.tinkoff.edu.java.bot.exceptions;

public record ApiErrorResponse(
        String description,
        String code,
        String exceptionName,
        String exceptionMessage,
        String[] stacktrace
) {
}
