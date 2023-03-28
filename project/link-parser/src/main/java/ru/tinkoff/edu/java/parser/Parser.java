package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.entities.Result;

import java.util.Arrays;
import java.util.List;

public abstract class Parser {
    final String SLASH = "/";
    final String HTTPS = "https:";
    final String domain;
    public Parser(String domain) {
        this.domain = domain;
    }
    public boolean isValidDomain(String[] tokens) {
        return tokens.length >= 3 && tokens[0].equals(HTTPS) && domain.equals(tokens[2]);
    }

    public String[] getTokens(String link) {
        String[] tokens = link.split(SLASH);
        if (!isValidDomain(tokens)) return null;
        return Arrays.stream(tokens).toList().subList(3, tokens.length).toArray(new String[0]);
    }
    public abstract Result parse(String link);
}
