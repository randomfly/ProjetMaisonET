package com.sopra.game.model;

public class Wizard extends Humanoid {

    private int mp;
    private int intellect;
    private boolean shield = false;
    private int shieldCount = 0;


    public Wizard(String name, double hp, int str) {
        super(name, hp, str);
        this.mp = 0;
        this.intellect = 0;
    }

    public Wizard(String name, double hp, int str, int mp, int intellect) {
        super(name, hp, str);
        this.mp = mp;
        this.intellect = intellect;
    }

    public void spellCast(Humanoid h) {
        if (this.mp > 10) {
            h.receiveDamage(this.str + this.intellect);
            this.mp -= 10;
        } else {
            h.receiveDamage(this.str);
        }
    }

    public void activateShield() {
        this.shield = true;
        this.shieldCount = 5;
    }

    public void addMana(int mana) {
        this.mp += mana;
    }

    @Override
    public void receiveDamage(double damage)
    {
        if (this.shieldCount > 0) {
            this.setHp(damage * 0.2);
            this.shieldCount--;
        } else {
            this.setHp(damage);
        }
    }

}
