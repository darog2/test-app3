package com.dungeon.game.weapons;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
        damageTable.set(DamageType.PIERCING,new Range(4,11));
        damageTable.set(DamageType.CHOPPING,new Range(3,6));
        damageTable.set(DamageType.CRUSHING,new Range(0,2));
    }
}
