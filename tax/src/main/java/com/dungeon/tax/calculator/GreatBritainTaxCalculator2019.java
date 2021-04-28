package com.dungeon.tax.calculator;

import com.dungeon.tax.autoconfig.Calculator;
import com.dungeon.tax.autoconfig.TaxCalculator;

@Calculator(country = "UK",since = "01.01.2019")
public class GreatBritainTaxCalculator2019 implements TaxCalculator {

    private final double nds = .195;
    private final double pensFond = .04;
    private final double socialFond = .015;
    private final double wineForQueenFond = .07;

    @Override
    public double calculateTax(double sum) {
        double ndsForSum = sum * nds;
        double pensForSum = sum * pensFond;
        double socialForSum = sum * socialFond;
        double wineForSum = sum * wineForQueenFond;

        double totalTax = ndsForSum + pensForSum + socialForSum + wineForSum;
        return totalTax;
    }

}
