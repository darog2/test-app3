package com.dungeon.pizza.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlType(name = "Products")
@XmlAccessorType(XmlAccessType.FIELD)
public class PizzaCollectionDTO {//DTO -- Data Transaction Object
    @XmlElement(name = "Pizza")
    private List<PizzaDTO> entries = new LinkedList<>();
}
