package com.dungeon.pizza.service;


import com.dungeon.pizza.model.Component;
import com.dungeon.pizza.model.ComponentAmount;
import com.dungeon.pizza.model.Order;
import com.dungeon.pizza.model.Pizza;
import com.dungeon.pizza.util.DateFormatUtil;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class OrderService {

    public static final String TOP_BORDER = "____________________________________________________";
    public static final String HEADER = "|                      PIZZA ORDER                 |";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String MIDDLE_BORDER = "|__________________________________________________|";
    public static final String ORDER_DATE = "| Order date    :  %-32.30s|%n";
    public static final String DELIVERY_DATE = "| Delivery date :  %-32.30s|%n";
    public static final String PIZZA_NAME_HEADER = "PIZZA: %s x %2d";
    public static final String CENTERED_PIZZA_NAME_HEADER = "|%50.50s|%n";
    public static final String PIZZA_NAME_TEMPLATE = "\"%s\"";
    public static final String CLIENT_NAME = "| Client  :    %-36.30s|%n";
    public static final String CLIENT_PHONE = "| Phone   :    %-36.30s|%n";
    public static final String CLIENT_ADDRESS = "| Address :    %-36.30s|%n";
    //    public static final String BASE_PRICE = "| Base price :                         $%-11.2f|%n";
    public static final String COMPONENT_TEMPLATE = "|  %-16.14s%-14.14s%16.16s  |%n";
    public static final String REPORT_NAME_TEMPLATE = "order_%s_%s__.txt";
    public static final String TOTAL_PRICE = "| Total price:                         $%,-11.2f|%n";
    public static final String PRICE_TEMPLATE = "%,6.2f x %1.1f";
    public static final String PRICE_PER = "|  Price per %-36.34s  |%n";
    public static final String PRICE_PER_PIZZA = "| %48.48s |%n";
    public static final String PRICE_PER_PIZZA_NUMBER_TEMPLATE = "$%,-6.2f";

    private String prepareReport(Order order) {
        StringBuilder report = new StringBuilder(TOP_BORDER);
        report.append(System.lineSeparator());
        report.append(HEADER);
        report.append(System.lineSeparator());
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(ORDER_DATE,
                DateFormatUtil.getStringFromDate(order.getOrderDate())));
        report.append(String.format(DELIVERY_DATE,
                DateFormatUtil.getStringFromDate(order.getDeliveryDate())));
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(CLIENT_NAME, order.getClient().getName()));
        report.append(String.format(CLIENT_PHONE, order.getClient().getPhoneNumber()));
        report.append(String.format(CLIENT_ADDRESS, order.getClient().getAddress()));
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        double totalPrice = 0;
        for (Map.Entry<Pizza, Integer> pizzaEntry : order.getPizzaMap().entrySet()) {
            double price = Pizza.MIN_PRICE;
            String formatPizzaName = formatPizzaName(pizzaEntry.getKey());
            String pizzaNameHeader = String.format(PIZZA_NAME_HEADER, formatPizzaName, pizzaEntry.getValue());
            report.append(String.format(CENTERED_PIZZA_NAME_HEADER, StringUtils.center(pizzaNameHeader, 50)));
            report.append(EMPTY_LINE);
            report.append(System.lineSeparator());
            for (Map.Entry<Component, ComponentAmount> compositionEntry : pizzaEntry.getKey().getComposition().entrySet()) {
                price = price + compositionEntry.getKey().getPrice() * compositionEntry.getValue().getPriceMultiplier();
                String formattedPrice = String.format(PRICE_TEMPLATE,
                        compositionEntry.getKey().getPrice(),
                        compositionEntry.getValue().getPriceMultiplier());
                report.append(String.format(COMPONENT_TEMPLATE,
                        compositionEntry.getKey().getName(),
                        compositionEntry.getValue().getNameInReport(),
                        formattedPrice));
            }
            String formattedPizzaPrice = String.format(PRICE_PER_PIZZA_NUMBER_TEMPLATE,
                    price);
            report.append(String.format(PRICE_PER, formatPizzaName));
            report.append(String.format(PRICE_PER_PIZZA, StringUtils.leftPad(formattedPizzaPrice, 48)));
            report.append(EMPTY_LINE);
            report.append(System.lineSeparator());
            report.append(EMPTY_LINE);
            report.append(System.lineSeparator());
//            report.append(String.format(BASE_PRICE, Pizza.MIN_PRICE));
            totalPrice = totalPrice + price * pizzaEntry.getValue();
        }
        report.append(MIDDLE_BORDER);
        report.append(System.lineSeparator());
        report.append(String.format(TOTAL_PRICE, totalPrice));
        report.append(MIDDLE_BORDER);
        report.append(System.lineSeparator());
        return report.toString();
    }

    private String formatPizzaName(Pizza pizza) {
        return String.format(PIZZA_NAME_TEMPLATE, pizza.getName());
    }

    public void printOrder(Order order) {
        String report = prepareReport(order);
        System.out.println(report);
    }

    private void writeOrderToFile(Order order) {
        String report = prepareReport(order);
        try (FileWriter writer = new FileWriter(generateOrderName(order))) {
            writer.write(report);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveOrder(Order order) {
        printOrder(order);
        writeOrderToFile(order);
        writeOrderToXmlFile(order, "order1.xml");
    }

    private String generateOrderName(Order order) {
        return String.format(REPORT_NAME_TEMPLATE,
                order.getClient().getName(),
                DateFormatUtil.formatDateAsReportNamePart(order.getOrderDate()));
    }

    private void writeOrderToXmlFile(Order order, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Order.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(order, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
