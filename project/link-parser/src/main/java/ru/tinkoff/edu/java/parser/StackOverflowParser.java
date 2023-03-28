package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.entities.StackOverflowResult;

public class StackOverflowParser extends Parser {
    final String QUE = "questions";

    public StackOverflowParser() {
        super("stackoverflow.com");
    }

    public StackOverflowResult parse(String link) {
        String[] tokens = getTokens(link);
        if (tokens == null || tokens.length < 2) return null;
        try {
            if (tokens[0].equals(QUE)) {
                return new StackOverflowResult(Integer.parseInt(tokens[1]));
            } else {
                return null;
            }
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
