package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class SShape extends Shape {
    public SShape() { }

    @Override
    public Shape makeMyShape() { return new SShape(); }
}
