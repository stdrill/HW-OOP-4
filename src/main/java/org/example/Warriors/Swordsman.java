package org.example.Warriors;

import org.example.PotectionTypes.Armour;
import org.example.PotectionTypes.Shield;
import org.example.Warriors.Warrior;
import org.example.Weapons.Sword;

public class Swordsman extends Warrior {
    public Swordsman(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, sword, shield);
    }

    public int protectRange(){
        return ((Shield)getProtection()).protect();
    }
    @Override
    public String toString() {
        return String.format("Swordsman{}" + super.toString());
    }
}
