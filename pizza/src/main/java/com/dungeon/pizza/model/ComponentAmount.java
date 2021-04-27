package com.dungeon.pizza.model;

public enum ComponentAmount {
    NONE(0, "none"),
    LESS(0.5, "Less"),
    MEDIUM(1, "Medium"),
    MORE(1.5, "More"),
    A_LOT(2, "A lot");

    private final double priceMultiplier;
    private final String nameInReport;

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public String getNameInReport() {
        return nameInReport;
    }

    ComponentAmount(double priceMultiplier, String nameInReport) {
        this.priceMultiplier = priceMultiplier;
        this.nameInReport = nameInReport;
    }

}
