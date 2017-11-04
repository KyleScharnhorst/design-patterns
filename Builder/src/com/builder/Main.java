package com.builder;

public class Main {

    public static House createHouse(HouseBuilder builder) {
        builder.buildHouse();

        int first_storey = 1;
        int second_storey = 2;

        int kitchen = 1;
        int living_room = 2;
        int office = 3;
        int bedroom = 4;
        int bathroom = 5;
        int hallway = 6;

        //first storey
        builder.buildStorey(first_storey);
        //rooms
        builder.buildRoom(kitchen, first_storey);
        builder.buildRoom(living_room, first_storey);
        builder.buildRoom(office, first_storey);
        builder.buildRoom(bathroom, first_storey);
        builder.buildRoom(hallway, first_storey);
        //doors
        builder.buildDoor(living_room, kitchen);
        builder.buildDoor(living_room, office);
        builder.buildDoor(office, hallway);
        builder.buildDoor(kitchen, hallway);
        builder.buildDoor(bathroom, hallway);

        //second storey
        builder.buildStorey(second_storey);
        builder.buildRoom(bedroom, second_storey);

        //stairs
        builder.buildStairs(first_storey, second_storey);

        return builder.getHouse();
    }

    public static void main(String[] args) {
        House house = createHouse(new SimpleHouseBuilder());
        System.out.println(house);
    }
}
