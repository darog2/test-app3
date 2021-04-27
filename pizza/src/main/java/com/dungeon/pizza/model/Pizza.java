package com.dungeon.pizza.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;

@Data
@XmlType(propOrder = {"name", "composition"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Pizza {
    @XmlAttribute
    private String name;
    public static final double MIN_PRICE = 5;
    @XmlElement(name = "Components")
    private Map<Component, ComponentAmount> composition;


    public Pizza() {
        this.composition = new HashMap<>();
    }

    public Pizza(String name) {
        this();
        this.name = name;
    }


}
