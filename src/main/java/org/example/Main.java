package org.example;

import org.example.PotectionTypes.Armour;
import org.example.PotectionTypes.Shield;
import org.example.Warriors.Archer;
import org.example.Warriors.Swordsman;
import org.example.Warriors.Warrior;
import org.example.Weapons.Bow;
import org.example.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Swordsman> team1 = new Team<>();
        team1.addWarrior(new Swordsman("Vasya", 250, new Sword(25), new Shield(20)))
                .addWarrior(new Swordsman("John", 200, new Sword(50), new Shield(35)));


        for (Swordsman swordsman : team1) {
            System.out.println(swordsman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarrior(new Archer("Katya", 300, new Bow(30,15), new Armour(35)))
                .addWarrior(new Archer("Masha", 200, new Bow(100, 50), new Armour(25)));

        System.out.println("____________");
        for (Archer archer : team2) {
            System.out.println(archer);
        }

        Team <Warrior> team3 = new Team<>();
        team3.addWarrior(new Swordsman("Elsa", 280, new Sword(27), new Shield(60)))
                        .addWarrior(new Swordsman("Shrek", 700, new Sword(60), new Shield(40)));

        System.out.println("____________");
        for (Warrior warrior : team3) {
            System.out.println(warrior);
        }

        System.out.println("____________");
        System.out.println(team1.minProtection());


    }
}