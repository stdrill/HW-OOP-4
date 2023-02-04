package org.example.Weapons;

public abstract class Weapon implements org.example.Weaponable {
    protected int damagePoint;

    public Weapon(int damagePoint){
        this.damagePoint = damagePoint;
    }
}
