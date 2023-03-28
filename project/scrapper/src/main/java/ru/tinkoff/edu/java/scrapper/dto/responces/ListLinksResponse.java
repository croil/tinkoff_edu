package ru.tinkoff.edu.java.scrapper.dto.responces;

import java.util.UUID;

public record ListLinksResponse(String[] links, UUID size) {
}
