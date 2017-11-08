package com.factory_method;

public abstract class Shape {
    protected int _size = 1;

    public enum Shapes {
        TRIANGLE,
        CIRCLE
    }

    // Factory Method
    public static Shape createSomeShape(Shapes shape_type) {
        switch(shape_type) {
            case TRIANGLE:
                return new Triangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new RuntimeException("Shape type: '" + shape_type + "' not handled.");
        }
    }

    // Factory method
    public abstract Shape createMyShape();

    public Shape clone() {
        Shape cloned_shape = createMyShape();
        cloned_shape.copy(this);
        return cloned_shape;
    }

    public void copy(Shape s) {
        set_size(s.get_size());
    }

    public int get_size() {
        return _size;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " size: " + this.get_size();
    }
}
