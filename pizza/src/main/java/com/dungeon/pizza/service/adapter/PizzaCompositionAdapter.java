package com.dungeon.pizza.service.adapter;

import com.dungeon.pizza.model.Component;
import com.dungeon.pizza.model.ComponentAmount;
import com.dungeon.pizza.model.dto.ComponentDTO;
import com.dungeon.pizza.model.dto.CompositionDTO;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class PizzaCompositionAdapter
        extends XmlAdapter<CompositionDTO, Map<Component, ComponentAmount>> {

    @Override
    public Map<Component, ComponentAmount> unmarshal(CompositionDTO xmlMap) throws Exception {
        Map<Component, ComponentAmount> result = new HashMap<>();
        //обычный цикл
        xmlMap.getEntries().forEach(componentDTO ->
                result.put(componentDTO, componentDTO.getQuantity()));

        return result;

    }

    @Override
    public CompositionDTO marshal(Map<Component, ComponentAmount> modelMap) throws Exception {
        CompositionDTO compositionDTO = new CompositionDTO();
        //цикл через лямбду(стрим)
        modelMap.forEach((component, componentAmount) ->
                compositionDTO.getEntries().add(new ComponentDTO(component, componentAmount)));
        return compositionDTO;
    }
}
