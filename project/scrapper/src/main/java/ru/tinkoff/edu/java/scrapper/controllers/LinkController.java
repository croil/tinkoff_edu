package ru.tinkoff.edu.java.scrapper.controllers;


import org.jetbrains.annotations.NotNull;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.scrapper.dto.requests.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.requests.ParameterizedRequest;
import ru.tinkoff.edu.java.scrapper.dto.requests.RemoveLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.responces.LinkResponse;
import ru.tinkoff.edu.java.scrapper.dto.responces.ListLinksResponse;

import java.util.UUID;

@RestController
public class LinkController {

    @PostMapping(value = "/links", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ListLinksResponse> get(@RequestBody @NotNull ParameterizedRequest request) {
        return ResponseEntity.ok(new ListLinksResponse(new String[]{"/links"}, UUID.randomUUID()));
    }

    @PostMapping(value = "/links", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LinkResponse> post(@RequestBody @NotNull AddLinkRequest request) {
        UUID id = UUID.randomUUID();
        return ResponseEntity.ok(new LinkResponse(id, "/links/%s".formatted(id)));
    }

    @PostMapping(value = "/links", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LinkResponse> delete(@RequestBody @NotNull RemoveLinkRequest request) {
        UUID id = UUID.randomUUID();
        return ResponseEntity.ok(new LinkResponse(id, "/links/%s".formatted(id)));
    }



}
