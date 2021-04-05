package com.dungeon.units;

import com.dungeon.weapons.Attacking;
import com.dungeon.weapons.Weapon;

public class Unit implements Attacking {

    protected String name ;
    protected String movementMethod;
    protected int currentHealth;
    protected int maxHealth;
    protected double armor;
    protected Weapon weapon;

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

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this. weapon =  weapon;
    }


    public void takeDamage(int incomingDamage){
        int damageReduction = (int) (incomingDamage * (armor / 100));
        int reducedDamage =incomingDamage - damageReduction;
        currentHealth = currentHealth - reducedDamage;
        System.out.println(name + " got " + reducedDamage + " damage");

    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        currentHealth = maxHealth;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public boolean isAlive(){
        return currentHealth > 0;
    }

    public void revive() {
        this.currentHealth = this.maxHealth;
    }

    @Override
    public void attack(Unit enemy) {
        this.weapon.attack(enemy);
    }

    public void heal(int healing) {
        if (currentHealth+healing>maxHealth) {
            revive();
        } else {
            currentHealth+=healing;
        }
    }

    @Override
    public String toString() {
        return "Unit{" +
                "\nname='" + name + '\'' +
                ", \nmovementMethod='" + movementMethod + '\'' +
                ", \nhealth=" + currentHealth + '/' + maxHealth+
                ", \narmor=" + armor +
                ", \nweapon='" + weapon + '\'' +
                '}';
    }
}
