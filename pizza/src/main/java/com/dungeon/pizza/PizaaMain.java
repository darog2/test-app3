package com.dungeon.pizza;

import com.dungeon.pizza.model.Client;
import com.dungeon.pizza.model.Component;
import com.dungeon.pizza.model.ComponentAmount;
import com.dungeon.pizza.model.Order;
import com.dungeon.pizza.model.Pizza;
import com.dungeon.pizza.service.OrderService;

import java.util.Calendar;
import java.util.Date;

public class PizaaMain {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Vasay");
        client.setAddress("Улица пушкина дом колотушкина");
        client.setPhoneNumber("1232189338");
        Component component=new Component("Hen",2.3);
        Component component1=new Component("Onion",3.12);
        Component component2=new Component("Tomato sauce",2.3);
        Component component3=new Component("Cucumber",1.1);
        Component component4=new Component("pepper",2.3);
        Component component5=new Component("Pineapple",1.17);
        Pizza pizza=new Pizza("Margarita");
        pizza.getComposition().put(component, ComponentAmount.LESS);
        pizza.getComposition().put(component2,ComponentAmount.MEDIUM);
        pizza.getComposition().put(component1,ComponentAmount.A_LOT);
        Pizza pizza1 =new Pizza("Govnitta");
        pizza1.getComposition().put(component3,ComponentAmount.MORE);
        pizza1.getComposition().put(component4,ComponentAmount.MEDIUM);
        pizza1.getComposition().put(component5,ComponentAmount.A_LOT);
        Order order=new Order(client);
        order.addPizza(pizza);
        order.addPizza(pizza);
        order.addPizza(pizza1);
        Date deliver = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(deliver);
        calendar.add(Calendar.HOUR,2);
        deliver = calendar.getTime();
        order.setDeliveryDate(deliver);
        OrderService orderService = new OrderService();
        orderService.printOrder(order);
        orderService.writeOrderToFile(order);
    }
}
