package com.interview.prep.prototype;

public class Weapon {

    String type;
    int damage;

    public Weapon(String type , int damage)
    {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
