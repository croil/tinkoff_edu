package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.entities.GithubResult;
import ru.tinkoff.edu.java.entities.Repo;
import ru.tinkoff.edu.java.entities.User;

public class GithubParser extends Parser {

    public GithubParser() {
        super("github.com");
    }

    public GithubResult parse(String link) {
        String[] tokens = getTokens(link);
        if (tokens == null || tokens.length < 2) return null;
        return new GithubResult(new User(tokens[0]), new Repo(tokens[1]));

    }
}
