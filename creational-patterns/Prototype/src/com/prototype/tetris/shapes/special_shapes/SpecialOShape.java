package com.prototype.tetris.shapes.special_shapes;

import com.prototype.tetris.shapes.Shape;

public class SpecialOShape extends Shape {
    public SpecialOShape() {}

    @Override
    public Shape makeMyShape() {
        return new SpecialOShape();
    }
}
