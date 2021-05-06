package com.dungeon.pizza.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
@XmlAccessorType(XmlAccessType.FIELD)
public enum ComponentAmount {
    NONE(0, "none"),
    LESS(0.5, "Less"),
    MEDIUM(1, "Medium"),
    MORE(1.5, "More"),
    A_LOT(2, "A lot");

    private final double priceMultiplier;
    private final String nameInReport;

    ComponentAmount(double priceMultiplier, String nameInReport) {
        this.priceMultiplier = priceMultiplier;
        this.nameInReport = nameInReport;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public String getNameInReport() {
        return nameInReport;
    }

}
