package org.example.Warriors;

import org.example.PotectionTypes.Armour;
import org.example.Warriors.Warrior;
import org.example.Weapons.Bow;

public class Archer extends Warrior {
    public Archer(String name, int healthPoint, Bow bow, Armour armour) {
        super(name, healthPoint, bow, armour);
    }
    public int shootRange(){
        return ((Bow)getWeapon()).getRange();
    }
    public int protectRange(){
        return ((Armour)getProtection()).protect();
    }

    @Override
    public String toString() {
        return "Archer{}" + super.toString();
    }
}
