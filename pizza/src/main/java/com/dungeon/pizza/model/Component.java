package com.dungeon.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlType(propOrder = {"name", "price"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlTransient
public class Component {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private double price;


}
