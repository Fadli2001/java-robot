package com.enigmacamp.models;

public class Position {
    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Position getRight(){
        return new Position(this.coordinateX + 1, coordinateY);
    }
    public Position getLeft(){
        return new Position(this.coordinateX - 1, coordinateY);
    }

    public Position getTop(){
        return new Position(this.coordinateX, coordinateY+1);
    }
    public Position getBottom(){
        return new Position(this.coordinateX - 1, coordinateY-1);
    }

    @Override
    public String toString() {
        return "Position{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}

