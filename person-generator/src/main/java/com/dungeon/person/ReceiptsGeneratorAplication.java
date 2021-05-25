package com.dungeon.person;

import com.dungeon.person.generators.impl.RandomDateBetweenGenerator;

import java.text.ParseException;

public class ReceiptsGeneratorAplication {
    public static void main(String[] args) throws ParseException {
        RandomDateBetweenGenerator dateGenerator=
                new RandomDateBetweenGenerator("01-01-2020",
                        "31-12-2020");

    }
}
