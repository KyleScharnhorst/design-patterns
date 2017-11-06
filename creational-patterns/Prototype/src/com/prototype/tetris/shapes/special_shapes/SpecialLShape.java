package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialLShape extends Shape {
    public SpecialLShape() {}

    @Override
    public Shape makeMyShape() {
        return new SpecialLShape();
    }
}
