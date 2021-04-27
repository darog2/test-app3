package com.dungeon.pizza.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class Pizza {
    private String name;
    public static final double MIN_PRICE = 5;
    private Map<Component, ComponentAmount> composition;

    public Map<Component, ComponentAmount> getComposition() {
        return composition;
    }

    public Pizza() {
        this.composition=new HashMap<>();
    }

    public Pizza(String name) {
        this();
        this.name = name;
    }


}
