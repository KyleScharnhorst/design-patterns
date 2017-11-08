package com.factory_method;

public class Main {

    private static void cloneAndPrint(Shape shape, int size) {
        shape.set_size(size);
        Shape cloned_shape = shape.clone();
        System.out.println(shape);
        System.out.println(cloned_shape);
    }

    public static void main(String[] args) {
        Shape triangle = Shape.createSomeShape(Shape.Shapes.TRIANGLE);
        Shape circle = Shape.createSomeShape(Shape.Shapes.CIRCLE);
        cloneAndPrint(triangle, 3);
        cloneAndPrint(circle, 6);
    }
}
