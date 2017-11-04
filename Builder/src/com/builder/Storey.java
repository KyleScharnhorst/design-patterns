package com.builder;

public class Storey implements ID {
    public final int _id;

    public Storey(int id){
        _id = id;
    }

    @Override
    public int getID() {
        return _id;
    }
}
