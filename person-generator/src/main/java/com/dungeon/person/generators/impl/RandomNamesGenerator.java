package com.dungeon.person.generators.impl;

import com.dungeon.person.util.CommonInputUtils;
import com.dungeon.person.generators.RandomGenerator;

import java.util.List;


/**
 *  {@link RandomNamesGenerator} can be used for
 *  <p>
 *  generating random names from prepared variants
 *  </p>
 *  stored in {@code this.namesList}
 */
public class RandomNamesGenerator implements RandomGenerator<String> {
    private final List<String> namesList;
    private final int namesCount;

    public RandomNamesGenerator(List<String> namesList) {
        this.namesList = namesList;
        namesCount = namesList.size();
    }

    @Override
    public String generate() {
        return namesList.get(CommonInputUtils.getInstance().randomInt(namesCount));
    }
}
