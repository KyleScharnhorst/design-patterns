package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class IShape extends Shape {
    public IShape() {}

    @Override
    public Shape makeMyShape() {
        return new IShape();
    }
}
