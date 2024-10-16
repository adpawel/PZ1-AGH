package org.example.XandY;

public class X {
    protected int xMask = 0x00ff;
    protected int fullMask;
    public X() {
        fullMask = xMask;
        System.out.println("fullMask x = " + fullMask);
        xMask = mask(xMask);
        System.out.println("xMask = " + xMask);
    }
    public int mask(int orig){
        return (orig & xMask);
    }
}
