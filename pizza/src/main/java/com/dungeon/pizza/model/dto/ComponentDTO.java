package com.dungeon.pizza.model.dto;

import com.dungeon.pizza.model.Component;
import com.dungeon.pizza.model.ComponentAmount;
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
@XmlType(name = "Component")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class ComponentDTO extends Component {
    @XmlAttribute(name = "quantity")
    private ComponentAmount quantity;

    public ComponentDTO() {
    }

    public ComponentDTO(Component component, ComponentAmount quantity) {
        super(component.getName(), component.getPrice());
        this.quantity = quantity;
    }
}
