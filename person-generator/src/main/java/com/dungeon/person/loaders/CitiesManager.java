package com.dungeon.person.loaders;

import com.dungeon.person.model.Cities;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CitiesManager {
    public Cities loadCities() throws IOException, URISyntaxException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Path path = Paths.get(ClassLoader.getSystemResource("task15/cities.json").toURI());
        String fileData = Files.lines(path).collect(Collectors.joining());
        Type type = new TypeToken<Map<String, List<String>>>() {
        }.getType();
        Map<String, List<String>> map = gson.fromJson(fileData, type);
        Cities cities = new Cities(map);
        return cities;
    }
}
