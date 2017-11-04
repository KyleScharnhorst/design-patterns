package com.builder;

public abstract class HouseBuilder {
    protected House _house = null;
    public abstract void buildHouse();
    public abstract void buildRoom(int room_id, int storey_id);
    public abstract void buildDoor(int room_id_1, int room_id_2);
    public abstract void buildStorey(int storey_id);
    public abstract void buildStairs(int storey_id_1, int storey_id_2);
    public abstract House getHouse();
}
