package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class ZShape extends Shape {
    public ZShape() {}

    @Override
    public Shape makeMyShape() {
        return new ZShape();
    }
}
