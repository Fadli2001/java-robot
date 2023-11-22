package com.enigmacamp;

import com.enigmacamp.models.Direction;
import com.enigmacamp.models.Position;
import com.enigmacamp.models.Robot;

public class Main {
    public static void main(String[] args) {
        Position position = new Position(2,3);
        Robot robot = new Robot(Direction.EAST, position);
        robot.moves("AARAAAAA");
    }
}
