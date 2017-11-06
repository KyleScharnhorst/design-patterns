package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialZShape extends Shape {
    public SpecialZShape() {}

    @Override
    public Shape makeMyShape() {
        return new SpecialZShape();
    }
}
