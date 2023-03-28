package ru.tinkoff.edu.java.scrapper.dto.requests;

import java.util.UUID;

public record ParameterizedRequest(String name, String in, boolean required, UUID schema) {

}
