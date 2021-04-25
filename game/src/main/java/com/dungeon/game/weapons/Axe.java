package com.dungeon.game.weapons;

public class Axe extends Weapon{
    public Axe() {
        super("Axe");
        damageTable.set(DamageType.PIERCING,new Range(0,2));
        damageTable.set(DamageType.CHOPPING,new Range(3,12));
        damageTable.set(DamageType.CRUSHING,new Range(1,5));
    }
}
