package com.builder;

import java.util.ArrayList;

public class Room implements ID{
    public ArrayList<Door> _doors = new ArrayList<>();
    public final int _id;
    public final Storey _storey;

    public Room(int room_id, Storey storey) {
        _id = room_id;
        _storey = storey;
    }

    @Override
    public int getID() {
        return _id;
    }

    public boolean addDoor(Door a_door) {
        return _doors.add(a_door);
    }
}
