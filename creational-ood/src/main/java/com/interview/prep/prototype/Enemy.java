package com.interview.prep.prototype;

public class Enemy implements Cloneable {

    private String type;
    private Weapon weapon;
    private int health;

    public Enemy(String type, Weapon weapon, int health) {
        this.type = type;
        this.weapon = weapon;
        this.health = health;
    }


    public Enemy(Enemy enemy) {
        this.type = enemy.type;
        this.weapon = new Weapon(enemy.getWeapon().getType(),enemy.getWeapon().getDamage());
        this.health = 100;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public Enemy clone() {
        try {
            Enemy clone = (Enemy) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Enemy getClone()
    {
        return new Enemy(this);
    }
}
