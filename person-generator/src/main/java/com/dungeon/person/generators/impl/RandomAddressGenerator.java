package com.dungeon.person.generators.impl;

import com.dungeon.person.util.CommonInputUtils;
import com.dungeon.person.generators.RandomGenerator;
import com.dungeon.person.model.Cities;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RandomAddressGenerator implements RandomGenerator<String> {

    private final Cities cities;
    private final List<String> streets;
    private final int maxHouseNumber;
    private final int maxApartmentNumber;

    public static final String ADDRESS_TEMPLATE = "%s, %s %s str. h. %d apt. %d";
    @Override
    public String generate() {
        int stateNumber = CommonInputUtils.getInstance().randomInt(
                cities.getCitiesMap().size()
        );
        String state = (String) cities.getCitiesMap().keySet().toArray()[stateNumber];
        int cityNumber = CommonInputUtils.getInstance().randomInt(cities.getCitiesMap().get(state).size());
        String city = cities.getCitiesMap().get(state).get(cityNumber);
        int house = CommonInputUtils.getInstance().randomInt(maxHouseNumber);
        int apartment = CommonInputUtils.getInstance().randomInt(maxApartmentNumber);
        String street = streets.get(CommonInputUtils.getInstance().randomInt(streets.size()));
        return String.format(ADDRESS_TEMPLATE, state, city, street, house, apartment);
    }
}
