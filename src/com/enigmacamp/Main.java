package com.enigmacamp;

public class Main {
    public static void main(String[] args) {
    //  Posisi awal semisal SOUTH
        Direction southDir = Direction.SOUTH;
        Direction southToEast = southDir.turnLeft();
        System.out.println(southToEast);
//        Silahkan coba arah yang lain
    }
}
