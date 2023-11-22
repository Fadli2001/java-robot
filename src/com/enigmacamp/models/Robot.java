package com.enigmacamp.models;

public class Robot {
    private Direction direction;
    private Position position;
    public Robot(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void moves(String commands){
        String[] commandArr = commands.split("");
        for (String command: commandArr){
            if(command.equals("A")){
                if(this.direction == Direction.EAST){
                    position = position.getRight();
                }if(this.direction == Direction.WEST){
                    position = position.getLeft();
                }if(this.direction == Direction.NORTH){
                    position = position.getTop();
                }if(this.direction == Direction.SOUTH){
                    position = position.getBottom();
                }
            }

            if(command.equals("R")){
                switch (direction){
                    case WEST:
                        direction= Direction.NORTH;
                    case NORTH:
                        direction= Direction.EAST;
                    case EAST:
                        direction = Direction.SOUTH;
                    case SOUTH:
                        direction = Direction.WEST;
                }
            }

            if(command.equals("L")){
                switch (direction){
                    case WEST:
                        direction= Direction.SOUTH;
                    case NORTH:
                        direction= Direction.WEST;
                    case EAST:
                        direction = Direction.NORTH;
                    case SOUTH:
                        direction = Direction.EAST;
                }
            }
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "direction=" + direction +
                ", position=" + position +
                '}';
    }
}