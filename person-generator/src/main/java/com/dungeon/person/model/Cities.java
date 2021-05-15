package com.dungeon.person.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Cities {
    private Map<String, List<String>> citiesMap;


}
