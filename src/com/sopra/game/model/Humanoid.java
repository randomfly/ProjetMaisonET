package com.sopra.game.model;

public abstract class Humanoid {

    protected String name;
    protected double hp;
    protected int str;

    public void attack(Humanoid h)
    {
        h.receiveDamage(this.str);
    }

    public void receiveDamage(double damage)
    {
        this.setHp(damage);
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if (hp < 0)
            hp = 0;
        this.hp = hp;
    }

    public Humanoid(String name, double hp, int str) {
        this.name = name;
        this.hp = hp;
        this.str = str;
    }

    public String getName() {
        return name;
    }
}
