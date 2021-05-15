package com.dungeon.person.loaders;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesLoader {
//    public List<String> loadFirstNames() throws URISyntaxException, IOException {
//        return load("names.txt");
//    }
//
//    public List<String> loadLastNames() throws URISyntaxException, IOException {
//        return load("last-names.txt");
//    }
//    public List<String> loadStreetNames() throws URISyntaxException, IOException {
//        return load("streets.txt");
//    }

    public List<String> load(String file) {
        List<String> fileData = new ArrayList<>();
        try {
            Path path = Paths.get(ClassLoader.getSystemResource("person_data/" + file).toURI());
            fileData = Files.lines(path).collect(Collectors.toList());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return fileData;

    }
}
