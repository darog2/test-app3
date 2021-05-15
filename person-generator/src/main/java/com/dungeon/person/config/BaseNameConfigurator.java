package com.dungeon.person.config;

import com.dungeon.person.util.CommonInputUtils;
import com.dungeon.person.loaders.NamesLoader;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNameConfigurator {

    protected static final NamesLoader _namesLoader = new NamesLoader();
    protected List<String> getFixedNamesQuantity(int namesCount, String file) {
        List<String> namesList = new ArrayList<>();
        List<String> strings = _namesLoader.load(file);
        int size = strings.size();
        for (int i = 0; i < namesCount; i++) {
            String lastName = strings.get(CommonInputUtils.getInstance().randomInt(size));
            namesList.add(lastName);
        }
        return namesList;
    }

}
