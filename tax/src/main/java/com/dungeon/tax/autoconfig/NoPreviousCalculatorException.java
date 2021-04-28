package com.dungeon.tax.autoconfig;

import java.util.Date;

public class NoPreviousCalculatorException extends Exception{
    private static final String MESSAGE_TEMPLATE = "No available calculators for date %s";
    public NoPreviousCalculatorException(Date date) {
        super(String.format(MESSAGE_TEMPLATE,date));
    }
}
