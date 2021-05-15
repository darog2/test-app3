package com.dungeon.person.generators.impl;

import com.dungeon.person.util.CommonInputUtils;
import com.dungeon.person.util.DateFormatUtil;
import com.dungeon.person.generators.RandomGenerator;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RandomDateBetweenGenerator implements RandomGenerator<Date> {
    private final LocalDate beginDate;
    private final long daysCount;

    public RandomDateBetweenGenerator(String ddMMyyyyStart, String ddMMyyyyEnd) throws ParseException {
        beginDate =
                DateFormatUtil.REPORT_DATE_FORMAT
                        .parse(ddMMyyyyStart)
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
        LocalDate endDate = DateFormatUtil.REPORT_DATE_FORMAT
                .parse(ddMMyyyyEnd)
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        daysCount = ChronoUnit.DAYS.between(beginDate, endDate);
    }
    @Override
    public Date generate() {
        LocalDate localDate = LocalDate.from(beginDate);
        localDate = ChronoUnit.DAYS.addTo(localDate, CommonInputUtils.getInstance().randomInt((int) daysCount));
        return Date.from(localDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
}
