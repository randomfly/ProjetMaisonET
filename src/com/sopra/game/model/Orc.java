package com.sopra.game.model;

public class Orc extends Humanoid {
    private int rage = 0;

    public Orc(String name, double hp, int str) {
        super(name, hp, str);
    }

    public boolean useRage() {
        return this.rage > 8;
    }

    public void addRage(int rage) {
        this.rage += rage;
    }

    @Override
    public void attack(Humanoid h){
        if (this.useRage()) {
            this.rage -= 8;
            h.receiveDamage(this.str * 1.5);
        } else {
            this.attack(h);
        }
    }
}
