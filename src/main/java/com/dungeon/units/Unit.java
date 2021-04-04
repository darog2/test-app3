package com.dungeon.units;

public class Unit {

    protected String name ;
    protected String movementMethod;
    protected int health;
    protected double armor;
    protected  String weapon;
    protected int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovementMethod() {
        return movementMethod;
    }

    public void setMovementMethod(String movementMethod) {
        this.movementMethod = movementMethod;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public  void takeDamage(int incomingDamage){
        int damageReduction = (int) (incomingDamage * (armor / 100));
        int reducedDamage =incomingDamage - damageReduction;
        health= health- reducedDamage;
        System.out.println(name + " got " + reducedDamage + " damage");

    }
    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "\nname='" + name + '\'' +
                ", \nmovementMethod='" + movementMethod + '\'' +
                ", \nhealth=" + health +
                ", \narmor=" + armor +
                ", \nweapon='" + weapon + '\'' +
                ", \ndamage=" + damage +
                '}';
    }
}
