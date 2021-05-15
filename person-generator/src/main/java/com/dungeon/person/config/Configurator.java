package com.dungeon.person.config;

import com.dungeon.person.generators.impl.RandomAddressGenerator;
import com.dungeon.person.generators.impl.RandomPersonGenerator;

public class Configurator {
    public static RandomPersonGenerator configureHumanGeneratorAlgorithm(
            RandomAddressGenerator randomAddressGenerator,
            PersonCreatorConfigurator personCreatorConfigurator
    ) {
        return new RandomPersonGenerator(
                personCreatorConfigurator.getFirstNamesGenerator(),
                personCreatorConfigurator.getLastNamesGenerator(),
                randomAddressGenerator,
                personCreatorConfigurator.getBirthDatesGenerator(),
                personCreatorConfigurator.getEmployedDatesGenerator(),
                personCreatorConfigurator.getSalaryGenerator());
    }
}
