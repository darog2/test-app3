package com.dungeon.person.config;

import com.dungeon.person.generators.RandomGenerator;
import com.dungeon.person.generators.impl.RandomDateBetweenGenerator;
import com.dungeon.person.generators.impl.RandomIntInRangeGenerator;
import com.dungeon.person.generators.impl.RandomNamesGenerator;
import lombok.AccessLevel;
import lombok.Getter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;

@Getter(AccessLevel.PACKAGE)
public class PersonCreatorConfigurator extends BaseNameConfigurator {
    private RandomGenerator<String> firstNamesGenerator;
    private RandomGenerator<String> lastNamesGenerator;
    private RandomGenerator<Date> birthDatesGenerator;
    private RandomGenerator<Date> employedDatesGenerator;
    private RandomGenerator<Integer> salaryGenerator;
    private PersonCreatorConfigurator(){}

    public static PersonCreatorConfigurator configurePersonalDataGenerationAlgorithm(){
        return new PersonCreatorConfigurator();
    }

    /**
     * Parses text from the given strings to produce a {@link RandomDateBetweenGenerator}..
     * <p>
     * See the {@link #birthDates(
     *             String ddMMyyyyStart,
     *             String ddMMyyyyEnd)}
     *
     * @param ddMMyyyyStart A <code>String</code> in format <tt>dd.MM.yyyy</tt>
     *                     <p/>whose should be parsed as lower bound.
     * @param ddMMyyyyEnd A <code>String</code> in format <tt>dd.MM.yyyy</tt>
     *                   <p/>whose should be parsed as upper bound.
     * @return A <code>{@link PersonCreatorConfigurator}</code> {@link this} to continue configuring.
     * @exception ParseException if the beginning of the specified string
     *            cannot be parsed.
     */
    public PersonCreatorConfigurator birthDates(
            String ddMMyyyyStart,
            String ddMMyyyyEnd)
            throws ParseException {
        birthDatesGenerator =
                new RandomDateBetweenGenerator(ddMMyyyyStart, ddMMyyyyEnd);
        return this;
    }

    /**
     * Parses text from the given strings to produce a {@link RandomDateBetweenGenerator}.
     * <p>
     * See the {@link #employedDates(
     *             String ddMMyyyyStart,
     *             String ddMMyyyyEnd)}
     *
     * @param ddMMyyyyStart A <code>String</code> in format <tt>dd.MM.yyyy</tt>
     *                     <p/>whose should be parsed as lower bound.
     * @param ddMMyyyyEnd A <code>String</code> in format <tt>dd.MM.yyyy</tt>
     *                   <p/>whose should be parsed as upper bound.
     * @return A <code>{@link PersonCreatorConfigurator}</code> {@link this} to continue configuring.
     * @exception ParseException if the beginning of the specified string
     *            cannot be parsed.
     */
    public PersonCreatorConfigurator employedDates(
            String ddMMyyyyStart,
            String ddMMyyyyEnd)
            throws ParseException {
        employedDatesGenerator =
                new RandomDateBetweenGenerator(ddMMyyyyStart, ddMMyyyyEnd);
        return this;
    }
    public PersonCreatorConfigurator salary(int min, int max){
        salaryGenerator = new RandomIntInRangeGenerator(min,max);
        return this;
    }

    private RandomGenerator<String> getNamesGenerator(String file, String... names) {
        return new RandomNamesGenerator(
                names.length == 0
                        ? _namesLoader.load(file)
                        : Arrays.asList(names)
        );
    }

    public PersonCreatorConfigurator firstNames(String... firstNames) {
        firstNamesGenerator =
                getNamesGenerator("names.txt", firstNames);
        return this;
    }

    public PersonCreatorConfigurator firstNames(int firstNamesCount){
        firstNamesGenerator = new RandomNamesGenerator(getFixedNamesQuantity(firstNamesCount, "names.txt"));
        return this;

    }

    public PersonCreatorConfigurator lastNames(String... lastNames) {
        lastNamesGenerator =
                getNamesGenerator("last-names.txt", lastNames);
        return this;
    }

    public PersonCreatorConfigurator lastNames(int lastNamesCount) {
        lastNamesGenerator = new RandomNamesGenerator(getFixedNamesQuantity(lastNamesCount, "last-names.txt"));
        return this;
    }
}
