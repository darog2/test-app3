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
@XmlType(name = "Composition")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompositionDTO {
    @XmlElement(name = "Component")
    private List<ComponentDTO> entries = new LinkedList<>();
}
