package ru.tinkoff.edu.java.bot.controllers;


import org.jetbrains.annotations.NotNull;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.bot.dto.requests.LinkUpdateRequest;
import ru.tinkoff.edu.java.bot.dto.responses.LinkUpdateResponse;

@RestController
public class UpdateController {
    @PostMapping(value = "/updates", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LinkUpdateResponse> post(@RequestBody @NotNull LinkUpdateRequest request) {
        return ResponseEntity.ok(new LinkUpdateResponse("Отправить обновление"));
    }
}
