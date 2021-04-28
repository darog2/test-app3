package com.dungeon.tax;

import com.dungeon.tax.autoconfig.Configuration;
import com.dungeon.tax.autoconfig.NoPreviousCalculatorException;
import com.dungeon.tax.autoconfig.TaxManager;
import com.dungeon.tax.model.Payment;
import com.dungeon.tax.util.DateFormatUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class TaxMain {
    private static final Logger _logger = LogManager.getLogger();

    public static void main(String[] args) {

        TaxManager manager = Configuration.configureManager();
        List<Payment> payments = Arrays.asList(
                new Payment("UK", DateFormatUtil.getDateFromString("22.03.1952"), 58_000),
                new Payment("UK", DateFormatUtil.getDateFromString("22.03.1965"), 58_000),
                new Payment("UK", DateFormatUtil.getDateFromString("22.03.1998"), 58_000),
                new Payment("UK", DateFormatUtil.getDateFromString("22.03.2019"), 5_000),
                new Payment("UK", DateFormatUtil.getDateFromString("12.06.2020"), 5_000),
                new Payment("UK", DateFormatUtil.getDateFromString("08.11.2021"), 5_000));
        for (Payment payment : payments) {
            double total = 0;
            try {
                total = manager.calculateTotalSum(payment);
                _logger.info(payment.toString() + " processed. Total sum is " + total);
            } catch (NoPreviousCalculatorException e) {
//                _logger.error(e.getMessage());
                _logger.error(ExceptionUtils.getStackTrace(e));
            }
        }
    }
}