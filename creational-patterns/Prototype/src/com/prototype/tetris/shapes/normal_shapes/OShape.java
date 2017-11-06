package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class OShape extends Shape {
    public OShape() {}

    @Override
    public Shape makeMyShape() {
        return new OShape();
    }
}
