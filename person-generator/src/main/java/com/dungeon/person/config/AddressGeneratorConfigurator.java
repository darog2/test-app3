package com.dungeon.person.config;

import com.dungeon.person.generators.RandomGenerator;
import com.dungeon.person.generators.impl.RandomAddressGenerator;
import com.dungeon.person.model.Cities;
import org.apache.commons.lang3.builder.Builder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddressGeneratorConfigurator
        extends BaseNameConfigurator
        implements Builder<RandomGenerator<String>> {

    private static final int DEFAULT_COUNT = 200;
    private Cities cities;
    private List<String> streets;
    private int maxHouseNumber = DEFAULT_COUNT;
    private int maxApartmentNumber = DEFAULT_COUNT;

    private AddressGeneratorConfigurator(){};

    public static AddressGeneratorConfigurator configurator(){return new AddressGeneratorConfigurator();}

    public AddressGeneratorConfigurator oneCountryCities(String country, String... cities) {
        this.cities = new Cities(Collections.singletonMap(country, Arrays.asList(cities)));
        return this;
    }
    public AddressGeneratorConfigurator maxHouseNumber(int maxHouseNumber) {
        this.maxHouseNumber = maxHouseNumber;
        return this;
    }
    public AddressGeneratorConfigurator maxApartmentNumber(int maxApartmentNumber) {
        this.maxApartmentNumber = maxApartmentNumber;
        return this;
    }
    public AddressGeneratorConfigurator streets(){
        streets = _namesLoader.load("streets.txt");
        return this;
    }
    public AddressGeneratorConfigurator streets(int differentStreetsCount){
        streets = getFixedNamesQuantity(differentStreetsCount,"streets.txt");
        return this;
    }
    public AddressGeneratorConfigurator streets(String... streets){
        this.streets = Arrays.asList(streets);
        return this;
    }

    @Override
    public RandomAddressGenerator build() {
        return new RandomAddressGenerator(cities,streets,maxHouseNumber,maxApartmentNumber);
    }
}
