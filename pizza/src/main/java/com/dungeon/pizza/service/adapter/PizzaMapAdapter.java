package com.dungeon.pizza.service.adapter;

import com.dungeon.pizza.model.Pizza;
import com.dungeon.pizza.model.dto.PizzaCollectionDTO;
import com.dungeon.pizza.model.dto.PizzaDTO;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class PizzaMapAdapter
        extends XmlAdapter<PizzaCollectionDTO, Map<Pizza, Integer>> {

    @Override
    public Map<Pizza, Integer> unmarshal(PizzaCollectionDTO xmlMap) throws Exception {
        Map<Pizza, Integer> result = new HashMap<>();
        //обычный цикл
        for (PizzaDTO pizzaDTO : xmlMap.getEntries()){
            result.put((Pizza) pizzaDTO, pizzaDTO.getQuantity());
        }
        return result;

    }

    @Override
    public PizzaCollectionDTO marshal(Map<Pizza,Integer> modelMap) throws Exception {
        PizzaCollectionDTO pizzaCollectionDto = new PizzaCollectionDTO();
        //цикл через лямбду(стрим)
        modelMap.forEach((component, componentAmount) -> pizzaCollectionDto.getEntries().add(new PizzaDTO(component,componentAmount)));
        return pizzaCollectionDto;
    }
}
