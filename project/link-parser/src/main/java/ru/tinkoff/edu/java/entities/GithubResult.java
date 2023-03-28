package ru.tinkoff.edu.java.entities;

public final class GithubResult extends Result {
    final User user;
    final Repo repo;

    public GithubResult(User user, Repo repo) {
        this.user = user;
        this.repo = repo;
    }
}
