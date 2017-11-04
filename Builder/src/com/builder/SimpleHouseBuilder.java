package com.builder;

public class SimpleHouseBuilder extends HouseBuilder {

    @Override
    public void buildHouse() {
        _house = new House();
    }

    @Override
    public void buildRoom(int room_id, int storey_id) {
        _house.addRoom(new Room(room_id, _house.getStorey(storey_id)));
    }

    @Override
    public void buildDoor(int room_id_1, int room_id_2) {
        _house.addDoor(new Door(_house.getRoom(room_id_1), _house.getRoom(room_id_2)));
    }

    @Override
    public void buildStorey(int storey_id) {
        _house.addStorey(new Storey(storey_id));
    }

    @Override
    public void buildStairs(int storey_id_1, int storey_id_2) {
        _house.addStair(new Stair(_house.getStorey(storey_id_1), _house.getStorey(storey_id_2)));
    }

    @Override
    public House getHouse() {
        return _house;
    }
}
