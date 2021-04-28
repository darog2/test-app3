package com.dungeon.tax.autoconfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface TaxCalculator {
    Logger _logger = LogManager.getLogger();
    double calculateTax(double sum);
}
