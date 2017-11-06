package com.prototype.tetris;

import com.prototype.tetris.shapes.*;

public class ShapePrototypeFactory extends ShapeFactory {
    protected final Shape IShape;
    protected final Shape JShape;
    protected final Shape LShape;
    protected final Shape OShape;
    protected final Shape SShape;
    protected final Shape TShape;
    protected final Shape ZShape;

    public ShapePrototypeFactory(Shape i, Shape j, Shape l, Shape o, Shape s, Shape t, Shape z) {
        //cloning passed in Shapes for defensive purposes.
        IShape = i.clone();
        JShape = j.clone();
        LShape = l.clone();
        OShape = o.clone();
        SShape = s.clone();
        TShape = t.clone();
        ZShape = z.clone();
    }

    protected Shape makeSomeShape(Shape s, Shape.Orientation position) {
        Shape cloned_shape = s.clone();
        cloned_shape.initialize(position);
        return cloned_shape;
    }

    @Override
    public Shape makeIShape(Shape.Orientation position) {
        return makeSomeShape(IShape, position);
    }

    @Override
    public Shape makeJShape(Shape.Orientation position) {
        return makeSomeShape(JShape, position);
    }

    @Override
    public Shape makeLShape(Shape.Orientation position) {
        return makeSomeShape(LShape, position);
    }

    @Override
    public Shape makeOShape(Shape.Orientation position) {
        return makeSomeShape(OShape, position);
    }

    @Override
    public Shape makeSShape(Shape.Orientation position) {
        return makeSomeShape(SShape, position);
    }

    @Override
    public Shape makeTShape(Shape.Orientation position) {
        return makeSomeShape(TShape, position);
    }

    @Override
    public Shape makeZShape(Shape.Orientation position) {
        return makeSomeShape(ZShape, position);
    }
}
