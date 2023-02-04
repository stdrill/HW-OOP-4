package org.example.PotectionTypes;

import org.example.PotectionTypes.Protection;

import java.util.Random;

public class Shield extends Protection {
    public Shield(int protectionPoint) {
        super(protectionPoint);
    }

    @Override
    public int protect() {
        return new Random().nextInt(0, protectionPoint);
    }

    @Override
    public String toString() {
        return "Shield " + protectionPoint;
    }
}
