package com.dungeon.person.generators;

/**
 * @param <T> is a target class for generator
 */
public interface RandomGenerator<T> {
    /**
     * @return T -- generated value
     * {@code T generate()} must contain generation algorithm
     */
    T generate();
}
