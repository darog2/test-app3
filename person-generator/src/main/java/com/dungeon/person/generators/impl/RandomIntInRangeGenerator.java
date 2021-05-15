package com.dungeon.person.generators.impl;

import com.dungeon.person.util.CommonInputUtils;
import com.dungeon.person.generators.RandomGenerator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RandomIntInRangeGenerator implements RandomGenerator<Integer> {
    private final int lowerBound;
    private final int upperBound;

    @Override
    public Integer generate() {

        return CommonInputUtils.getInstance()
                .randomInt(upperBound-lowerBound)
                +lowerBound
                +1;
    }
}
