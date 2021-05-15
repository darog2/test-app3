package com.dungeon.person.generators.impl;

import com.dungeon.person.generators.RandomGenerator;
import com.dungeon.person.model.Human;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class RandomPersonGenerator implements RandomGenerator<Human> {
    private final RandomGenerator<String> firstNamesGenerator;
    private final RandomGenerator<String> lastNamesGenerator;
    private final RandomGenerator<String> addressesGenerator;
    private final RandomGenerator<Date> birthDatesGenerator;
    private final RandomGenerator<Date> employedDatesGenerator;
    private final RandomGenerator<Integer> salaryGenerator;


    @Override
    public Human generate() {

        Human human = new Human(
                firstNamesGenerator.generate(),
                lastNamesGenerator.generate(),
                addressesGenerator.generate(),
                birthDatesGenerator.generate(),
                employedDatesGenerator.generate(),
                salaryGenerator.generate()
        );
        return human;
    }


}
