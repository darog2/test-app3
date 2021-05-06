package com.dungeon.pizza.model;

import com.dungeon.pizza.service.adapter.PizzaMapAdapter;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"client", "orderDate", "deliveryDate", "pizzaMap",})
public class Order {
    @XmlElement(name = "Pizzas")
    @XmlJavaTypeAdapter(PizzaMapAdapter.class)
    private Map<Pizza, Integer> pizzaMap;
    @XmlElement
    private Client client;
    @XmlElement
    private Date orderDate;
    @XmlElement
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
            existingCount += count;
            pizzaMap.replace(pizza, existingCount);
        } else {
            this.pizzaMap.put(pizza, count);
        }
    }

    public void addPizza(Pizza pizza) {
        addPizza(pizza, 1);
    }

}
