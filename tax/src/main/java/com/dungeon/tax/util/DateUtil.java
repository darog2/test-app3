package com.dungeon.tax.util;

import java.util.Date;

public class DateUtil {

    public static final int MILLIS = 1000;
    public static final int MINUTES = 60;
    public static final int SECONDS = 60;
    public static final int HOURS = 24;

    public static long daysBetweenDates(Date first, Date second){
        long diff = first.getTime() - second.getTime();
        return millisToDays(diff);
    }
    public static long millisToDays(long millis){
        return millis / MILLIS / SECONDS / MINUTES / HOURS;
    }
}
