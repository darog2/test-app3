package com.dungeon.pizza.service.adapter;

import com.dungeon.pizza.model.Pizza;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PizzaMapAdapter
        extends XmlAdapter<PizzaMapAdapter.AdaptedPizzaMap, Map<Pizza, Integer>> {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlType(name = "Products")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class AdaptedPizzaMap {
        @XmlElement(name = "Product")
        private List<PizzaMapEntry> entries = new LinkedList<>();
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @XmlType(name = "Product")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class PizzaMapEntry {
        @XmlElement(name = "Pizza")
        private Pizza key;
        @XmlElement(name = "quantity")
        private Integer value;
    }

    @Override
    public Map<Pizza, Integer> unmarshal(AdaptedPizzaMap xmlMap) throws Exception {
        Map<Pizza, Integer> result = new HashMap<>();
        //обычный цикл
        for (PizzaMapEntry pizzaMapEntry : xmlMap.entries){
            result.put(pizzaMapEntry.key, pizzaMapEntry.value);
        }
        return result;
    }

    @Override
    public AdaptedPizzaMap marshal(Map<Pizza,Integer> modelMap) throws Exception {
        AdaptedPizzaMap adaptedPizzaMap = new AdaptedPizzaMap();
        //цикл через лямбду(стрим)
        modelMap.forEach((component, componentAmount) -> adaptedPizzaMap.entries.add(new PizzaMapEntry(component,componentAmount)));
        return adaptedPizzaMap;
    }
}