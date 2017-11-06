package com.prototype.tetris;

import com.prototype.tetris.shapes.*;

public abstract class ShapeFactory {
    public abstract Shape makeIShape(Shape.Orientation position);
    public abstract Shape makeJShape(Shape.Orientation position);
    public abstract Shape makeLShape(Shape.Orientation position);
    public abstract Shape makeOShape(Shape.Orientation position);
    public abstract Shape makeSShape(Shape.Orientation position);
    public abstract Shape makeTShape(Shape.Orientation position);
    public abstract Shape makeZShape(Shape.Orientation position);
}
