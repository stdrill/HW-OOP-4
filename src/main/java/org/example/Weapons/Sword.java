package org.example.Weapons;

import java.util.Random;

public class Sword extends Weapon{

    public Sword(int damagePoint) {
        super(damagePoint);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, damagePoint);
    }

    @Override
    public int getRange() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Damage: ", damagePoint);
    }
}
