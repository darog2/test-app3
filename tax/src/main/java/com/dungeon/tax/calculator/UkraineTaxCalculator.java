package com.dungeon.tax.calculator;

import com.dungeon.tax.autoconfig.Calculator;
import com.dungeon.tax.autoconfig.TaxCalculator;

@Calculator(country = "UA",since = "01.01.2018")
public class UkraineTaxCalculator implements TaxCalculator {
    private final double nds = .195;
    private final double pensFond = .04;
    private final double ato = .015;
    private final double progressiveBefore = .10;
    private final double progressiveAfter = .19;
    private final double progressiveEdge = 50_000;

    @Override
    public double calculateTax(double sum) {
        double ndsForSum = sum * nds;
        double pensForSum = sum * pensFond;
        double atoForSum = sum * ato;
        double progressiveForSum;
        if (progressiveEdge < sum) {
            progressiveForSum = sum * progressiveAfter;
        } else {
            progressiveForSum = sum * progressiveBefore;
        }
        double totalTax = ndsForSum + pensForSum + atoForSum + progressiveForSum;
        return totalTax;
    }
}
