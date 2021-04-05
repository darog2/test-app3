package com.dungeon;

import com.dungeon.units.Unit;
import com.dungeon.weapons.Axe;
import com.dungeon.weapons.DamageType;
import com.dungeon.weapons.Glaive;
import com.dungeon.weapons.Sword;
import com.dungeon.weapons.Weapon;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Unit _Navalniy=new Unit();
        _Navalniy.setName("Алексей Навальный");
        _Navalniy.setArmor(30);
        _Navalniy.setWeapon(new Glaive());
        _Navalniy.setMaxHealth(100);
        _Navalniy.setMovementMethod("На Автозаке");
        Unit omonovec= new Unit();
        omonovec.setName("Иван Запутенец");
       omonovec.setArmor(30);
       omonovec.setWeapon(new Axe());
       omonovec.setMaxHealth(100);
       omonovec.setMovementMethod("На Автозаке");
       fight(_Navalniy,omonovec);
        System.out.println("_Navalniy = " + _Navalniy.getCurrentHealth());
        _Navalniy.heal(250);
        _Navalniy.revive();
        omonovec.revive();
//        fight(_Navalniy,omonovec);
        System.out.println();

        }


       //fight again

    public static void fight(Unit unit1, Unit unit2){
        int round=1;
        while (unit1.isAlive()&&unit2.isAlive()) {
            System.out.println("\nround = " + round);
            round++;
            unit1.attack(unit2);
            unit2.attack(unit1);
//            unit2.takeDamage(unit1.getDamage());
//            unit1.takeDamage(unit2.getDamage());
//            System.out.println(unit2.toString());
//            System.out.println(unit1.toString());
        }
        if(unit1.isAlive()){
            System.out.println("Навальный победил");
        }else {
            System.out.println("ПУтин флексит на аква дискотеке");
        }
    }
}
