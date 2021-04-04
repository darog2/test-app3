package com.dungeon;

import com.dungeon.units.Unit;

public class Main {
    public static void main(String[] args) {
        Unit _Navalniy=new Unit();
        _Navalniy.setName("Алексей Навальный");
        _Navalniy.setArmor(515);
        _Navalniy.setDamage(150);
        _Navalniy.setWeapon("пластиковый стаканчик");
        _Navalniy.setHealth(9450);
        _Navalniy.setMovementMethod("На Автозаке");
        Unit omonovec= new Unit();
        omonovec.setName("Иван Запутенец");
       omonovec.setArmor(55);
       omonovec.setDamage(282);
       omonovec.setWeapon("БУТЫЛКА ПУТИНА");
       omonovec.setHealth(7250);
       omonovec.setMovementMethod("На Автозаке");
       int round=1;
       while (_Navalniy.isAlive()&&omonovec.isAlive()) {
           System.out.println("round = " + round);
           round++;
           omonovec.takeDamage(_Navalniy.getDamage());
           _Navalniy.takeDamage(omonovec.getDamage());
       }
       if(_Navalniy.isAlive()){
           System.out.println("Навальный победил");
       }else {
           System.out.println("ПУтин флексит на аква дискотеке");
       }
        System.out.println("_Navalniy = " + _Navalniy.getHealth());
       _Navalniy.heal();
       _Navalniy.heal();
       //fight again
    }
}
