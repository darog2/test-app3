package com.dungeon.tax.calculator;

import com.dungeon.tax.autoconfig.Calculator;
import com.dungeon.tax.autoconfig.TaxCalculator;

@Calculator(country = "UK",since = "01.01.2021")
public class GreatBritainTaxCalculator2021 implements TaxCalculator {

    private final double nds = .195;
    private final double socialFond = .215;
    private final double progressiveBefore = .07;
    private final double progressiveAfter = .54;
    private final double progressiveEdge = 150_000;

    @Override
    public double calculateTax(double sum) {
        double ndsForSum = sum * nds;
        double socialForSum = sum * socialFond;
        double progressiveForSum = progressive(sum);

        double totalTax = ndsForSum + socialForSum + progressiveForSum;
        return totalTax;
    }

    public double progressive(double sum) {
        if (progressiveEdge < sum) {
            return sum * progressiveAfter;
        } else {
            return sum * progressiveBefore;
        }
    }
}
