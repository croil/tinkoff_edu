package ru.tinkoff.edu.java;

import ru.tinkoff.edu.java.entities.Result;
import ru.tinkoff.edu.java.parser.GithubParser;
import ru.tinkoff.edu.java.parser.Parser;
import ru.tinkoff.edu.java.parser.StackOverflowParser;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Parser> parsers = List.of(
                new GithubParser(),
                new StackOverflowParser()
        );
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        for (Parser p : parsers) {
            Result res = p.parse(line);
            if (res != null) {
                System.out.println(res);
                break;
            }
        }
    }
}
