package org.example.Warriors;

import org.example.Protective;
import org.example.Weaponable;

public abstract class Warrior {
    private String name;
    private int healthPoint;

    private Weaponable weapon;
    private Protective protection;

    public Warrior(String name, int healthPoint, Weaponable weapon, Protective protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Protective getProtection() {
        return protection;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }
}
