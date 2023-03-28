package ru.tinkoff.edu.java.bot.dto.requests;

import java.util.UUID;

public record LinkUpdateRequest(int id, String url, String description, UUID[] tgChatsIds) {
}
