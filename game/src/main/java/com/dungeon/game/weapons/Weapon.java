package com.dungeon.game.weapons;

import com.dungeon.game.units.Unit;

import java.util.Random;

public class Weapon implements Attacking{
   protected String name;
   protected DamageTable damageTable;
   protected static final Random random =new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Weapon(String name) {
        this.name = name;
        this.damageTable = new DamageTable();

    }

    @Override
    public void attack(Unit enemy) {
        int damage = damageTable.generateDamage();
        enemy.takeDamage(damage);
    }

}
