package com.enigmacamp;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;
    public Direction turnRight() {
        return values()[(ordinal()+1)%4];
    }
    public Direction turnLeft() {
        return values()[(ordinal()+3)%4];
    }
}


