package com.factory_method;

public class Circle extends Shape {
    @Override
    public Shape createMyShape() {
        return new Circle();
    }
}
