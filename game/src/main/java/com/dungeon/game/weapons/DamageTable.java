package com.dungeon.game.weapons;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;

public class DamageTable {
    private Map<DamageType,Range> table;

    public DamageTable() {
        this.table = new EnumMap<>(DamageType.class);
    }
    public void set(DamageType type,Range range){
        table.put(type,range);
    }
    public int generateDamage(){
        Random random = new Random();
        int randomTypeNumber = random.nextInt(3);
        DamageType randomType = DamageType.values()[randomTypeNumber];
        System.out.println(randomType);
        return table.get(randomType).randomValue();
    }
}
