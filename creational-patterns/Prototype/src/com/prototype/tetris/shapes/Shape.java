package com.prototype.tetris.shapes;

public abstract class Shape {
    public enum Orientation {
        UP, RIGHT, DOWN, LEFT
    }

    //default position up
    Orientation _position = Orientation.UP;

    public Shape clone() {
        Shape s = makeMyShape();
        s.copy(this);
        return s;
    }

    public void initialize(Orientation position) {
        _position = position;
    }

    public abstract Shape makeMyShape();

    public void copy(Shape s) {
        _position = s._position;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
