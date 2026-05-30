package com.interview.prep;

import com.interview.prep.builder.Email;
import com.interview.prep.prototype.Enemy;
import com.interview.prep.prototype.Weapon;
import com.interview.prep.singletonPattern.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

        DoubleLockingSingleton doubleLockingSingleton = DoubleLockingSingleton.getInstance();
        DoubleLockingSingleton doubleLockingSingleton1 = DoubleLockingSingleton.getInstance();

        BillPughSingleton billPughSingleton = BillPughSingleton.BillPlugSingletonInnerClass.getInstance();
        BillPughSingleton billPughSingleton1 = BillPughSingleton.BillPlugSingletonInnerClass.getInstance();




        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        EnumSingleton enumSingleton1 =  EnumSingleton.INSTANCE;

        enumSingleton.getTaxDetailsBasedOnState("US");

        System.out.println(billPughSingleton1.hashCode() == billPughSingleton.hashCode());

        Email email = new Email.EmailBuilder("to.@gmail.com").build();

        Weapon weapon = new Weapon("Blaster",20);

        Enemy enemy = new Enemy("Small",weapon,100);
        Enemy enemy1 = enemy.getClone();

        System.out.println(enemy.getWeapon().getDamage());
        weapon.setDamage(40);
        System.out.println(enemy.getWeapon().getDamage());
        System.out.println(enemy1.getWeapon().getDamage());







    }
}