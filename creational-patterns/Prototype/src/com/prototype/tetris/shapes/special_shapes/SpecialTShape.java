package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialTShape extends Shape {
    public SpecialTShape() {}

    @Override
    public Shape makeMyShape() {
        return new SpecialTShape();
    }
}
