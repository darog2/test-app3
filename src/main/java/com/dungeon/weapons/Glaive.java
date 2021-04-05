package com.dungeon.weapons;

public class Glaive extends Weapon{

    public Glaive() {
        super("glaive");
        damageTable.set(DamageType.PIERCING,new Range(3,11));
        damageTable.set(DamageType.CHOPPING,new Range(3,11));
        damageTable.set(DamageType.CRUSHING,new Range(0,1));
    }
}
