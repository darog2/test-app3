package com.dungeon.pizza.model.dto;

import com.dungeon.pizza.model.Pizza;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@EqualsAndHashCode(callSuper = true)
@Data
@XmlType(name = "Pizza")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class PizzaDTO extends Pizza {
    public PizzaDTO() {
    }

    @XmlAttribute(name = "quantity")
    private Integer quantity;

    public PizzaDTO(Pizza pizza, Integer quantity) {
        super(pizza);
        this.quantity = quantity;
    }
}
