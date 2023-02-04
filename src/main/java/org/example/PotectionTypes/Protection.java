package org.example.PotectionTypes;

import org.example.Protective;

public class Protection implements Protective {
    protected int protectionPoint;

    public Protection(int protectionPoint){
        this.protectionPoint = protectionPoint;
    }

    @Override
    public int protect() {
        return 0;
    }

    @Override
    public int protectRange() {
        return 0;
    }
}
