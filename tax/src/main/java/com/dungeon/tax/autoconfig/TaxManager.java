package com.dungeon.tax.autoconfig;

import com.dungeon.tax.model.Payment;
import com.dungeon.tax.util.DateUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaxManager {
    private Map<String, TreeMap<Date,TaxCalculator>> calculatorMap = new HashMap<>();

    public TaxManager addCalculator(String country,Date since, TaxCalculator calculator) {
        if (calculatorMap.containsKey(country)) {
            calculatorMap.get(country).put(since,calculator);
        } else {
            calculatorMap
                    .put(country, new TreeMap<>());
                    calculatorMap.get(country).put(since,calculator);
        }
        return this;
    }

    public double calculateTotalSum(Payment payment) throws NoPreviousCalculatorException {
        TaxCalculator calculator =
                calculatorMap
                        .get(payment.getCountry())
                        .get(nearestPreviousDate(payment));
        double tax = calculator.calculateTax(payment.getSum());
//        System.out.println(calculator.getClass().getSimpleName());
        return payment.getSum() + tax;
    }
    private Date nearestPreviousDate(Payment payment) throws NoPreviousCalculatorException {
        long minDaysBetween = 0;
        Date result = payment.getDate();
        for (Date date: calculatorMap.get(payment.getCountry()).keySet()) {
            long between = DateUtil.daysBetweenDates(date,payment.getDate());
            if (minDaysBetween == 0){
                minDaysBetween = between;
            }
            if (between < 0 && between>= minDaysBetween) {
                minDaysBetween = between;
                result = date;
            }
        }
        if (minDaysBetween>0) {
            throw new NoPreviousCalculatorException(payment.getDate());
        }
        return result;
    }

}
