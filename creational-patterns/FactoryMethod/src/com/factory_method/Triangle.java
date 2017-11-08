package com.factory_method;

/**
 * Concrete class that implements the factory method.
 */
public class Triangle extends Shape {
    @Override
    public Shape createMyShape() {
        return new Triangle();
    }
}
