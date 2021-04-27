package com.dungeon.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlType(propOrder = {"name","phoneNumber","address",})
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String address;
    @XmlAttribute
    private String phoneNumber;//+38-095-554-54-25

}
