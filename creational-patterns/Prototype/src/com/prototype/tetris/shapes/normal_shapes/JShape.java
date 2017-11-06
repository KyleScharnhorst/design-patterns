package com.prototype.tetris.shapes.normal_shapes;

import com.prototype.tetris.shapes.Shape;

public class JShape extends Shape {
    public JShape() {}

    @Override
    public Shape makeMyShape() { return new JShape(); }
}
