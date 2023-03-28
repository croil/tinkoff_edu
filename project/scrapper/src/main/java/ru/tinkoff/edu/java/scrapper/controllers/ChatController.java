package ru.tinkoff.edu.java.scrapper.controllers;


import org.jetbrains.annotations.NotNull;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.scrapper.dto.requests.ParameterizedRequest;
import ru.tinkoff.edu.java.scrapper.dto.responces.ChatResponse;

@RestController
public class ChatController {

    @PostMapping(value = "/tg-chat/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChatResponse> post(@RequestBody @NotNull ParameterizedRequest request) {
        return ResponseEntity.ok(new ChatResponse("200"));
    }

    @PostMapping(value = "/tg-chat/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChatResponse> delete(@RequestBody @NotNull ParameterizedRequest request) {
        return ResponseEntity.ok(new ChatResponse("200"));
    }
}
