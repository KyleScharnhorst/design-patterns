package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class TShape extends Shape {
    public TShape() {}

    @Override
    public Shape makeMyShape() {
        return new TShape();
    }
}
