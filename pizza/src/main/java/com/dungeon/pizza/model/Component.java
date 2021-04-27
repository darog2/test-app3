package com.dungeon.pizza.model;

import lombok.Data;

@Data
public class Component {
    private String name;
    private double price;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Component() {

    }

}
