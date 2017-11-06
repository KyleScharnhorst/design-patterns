package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialSShape extends Shape {
    public SpecialSShape() { }

    @Override
    public Shape makeMyShape() { return new SpecialSShape(); }
}
