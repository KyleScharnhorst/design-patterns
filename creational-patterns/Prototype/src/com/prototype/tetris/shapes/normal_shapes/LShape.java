package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class LShape extends Shape {
    public LShape() {}

    @Override
    public Shape makeMyShape() {
        return new LShape();
    }
}
