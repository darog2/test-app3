package com.dungeon.tax.autoconfig;

import com.dungeon.tax.util.DateFormatUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.reflections.Reflections;

import java.text.MessageFormat;
import java.util.Set;

public class Configuration {
    private static final Logger _logger = LogManager.getLogger(Configuration.class);
    public static final String CONFIGURED = "Configured {0} for {1} since {2}";

    public static TaxManager configureManager() {
        TaxManager taxManager = new TaxManager();
        Reflections reflections = new Reflections("com.dungeon.tax");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Calculator.class);
        try {
            for (Class<?> c : set) {
                Calculator annotation = c.getAnnotation(Calculator.class);
                taxManager.addCalculator(
                        annotation.country(),
                        DateFormatUtil.getDateFromString(annotation.since()),
                        (TaxCalculator) c.newInstance());
                _logger.info(
                        MessageFormat.format(CONFIGURED,
                                c.getName(),
                                annotation.country(),
                                annotation.since()));
            }
        } catch (InstantiationException | IllegalAccessException e) {
            _logger.error(e.getStackTrace());
        }
        return taxManager;
    }

    public static void reflection() {
        Reflections reflections = new Reflections("com.dungeon.tax");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Calculator.class);
        for (Class c : set) {
            Calculator annotation = (Calculator) c.getAnnotation(Calculator.class);
            System.out.println(
                    c.getSimpleName() + "   "
                            + annotation.country() + "   "
                            + annotation.since());

        }

    }
}
