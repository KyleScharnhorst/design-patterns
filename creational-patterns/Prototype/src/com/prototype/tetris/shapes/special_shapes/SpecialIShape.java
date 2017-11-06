package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialIShape extends Shape {
    public SpecialIShape() {}

    @Override
    public Shape makeMyShape() { return new SpecialIShape(); }
}
