package ru.tinkoff.edu.java.entities;

public final class StackOverflowResult extends Result {
    public StackOverflowResult(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    final int id;

}
