package org.example.XandY;

public class Y extends X {
    protected int yMask = 0xff00;
    public Y(){
        fullMask = yMask;
        System.out.println("fullMask y = " + fullMask);
        yMask = mask(yMask);
        System.out.println("yMask = " + yMask);
    }

    public int mask(int orig){
        return (orig | yMask);
    }
}
