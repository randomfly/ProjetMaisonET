package com.sopra.game.model;

public class Warrior extends Humanoid {

    public Warrior(String name, int hp, int str) {
        super(name, hp, str);
    }

    public void doubleAttack(Humanoid h) {
        h.receiveDamage(this.str*0.7);
        h.receiveDamage(this.str*0.7);
    }
}
