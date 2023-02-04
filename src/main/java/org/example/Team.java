package org.example;

import org.example.Warriors.Archer;
import org.example.Warriors.Swordsman;
import org.example.Warriors.Warrior;

import java.util.*;

public class Team <E extends Warrior> implements Iterable<E>{
    private List<E> team = new ArrayList<>();

    public Team <E> addWarrior(E person){
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }
    public int maxRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer){
                if (((Archer)item).shootRange() > maxRange){
                    maxRange = ((Archer)item).shootRange();
                }
            }
        }
        return maxRange;
    }
    public int minProtection(){
        int minProtect = 999;
        for (E item: team) {
            if (item.getProtection().protectRange() < minProtect) {
                minProtect = item.getProtection().protectRange();
            }
        }
        return minProtect;
    }
}
