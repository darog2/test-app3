package com.dungeon.pizza.model;

import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Data
public class Order {
    private Map<Pizza, Integer> pizzaMap;
    private Client client;
    private Date orderDate;
    private Date deliveryDate;

    public Order(Client client) {
        this();
        this.client = client;

    }

    public Order() {
        this.pizzaMap = new HashMap<>();
        this.orderDate = new Date();
    }

    public void addPizza(Pizza pizza, Integer count) {
        if (pizzaMap.containsKey(pizza)) {
            int existingCount = pizzaMap.get(pizza);
            existingCount+=count;
            pizzaMap.replace(pizza,existingCount);
        } else {
            this.pizzaMap.put(pizza, count);
        }
    }

    public void addPizza(Pizza pizza) {
        addPizza(pizza,1);
    }

}
