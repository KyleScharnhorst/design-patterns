package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialJShape extends Shape {
    public SpecialJShape() {}

    @Override
    public Shape makeMyShape() { return new SpecialJShape(); }
}
