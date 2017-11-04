package com.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class House {
    public ArrayList<Storey> _stories = new ArrayList<>();
    public ArrayList<Room> _rooms = new ArrayList<>();
    public ArrayList<Door> _doors = new ArrayList<>();
    public ArrayList<Stair> _stairs = new ArrayList<>();

    public boolean addStorey(Storey a_storey) {
        return _stories.add(a_storey);
    }
    public boolean addRoom(Room a_room) {
        return _rooms.add(a_room);
    }
    public boolean addDoor(Door a_door) { return _doors.add(a_door); }
    public boolean addStair(Stair a_stair) { return _stairs.add(a_stair); }

    public Storey getStorey(int storey_id) {
        return House.getX(storey_id, _stories, _stories.getClass().getSimpleName());
    }

    public Room getRoom(int room_id) {
        return House.getX(room_id, _rooms, _rooms.getClass().getSimpleName());
    }

    private static <T extends ID> T getX(int id, ArrayList<T> al, String t_name) {
        Iterator<T> itr = al.iterator();
        while (itr.hasNext()) {
            T t = itr.next();
            if(t.getID() == id) {
                return t;
            }
        }

        throw new NoSuchElementException( t_name + " with ID: '" + id + "' does not exist.");
    }

    @Override
    public String toString() {
        return "This house has:\n" +
                _stories.size() + " stories\n" +
                _rooms.size() + " rooms\n" +
                _doors.size() + " doors\n" +
                _stairs.size() + " stairs";
    }
}
