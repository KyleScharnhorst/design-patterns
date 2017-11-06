package com.prototype;

import com.prototype.tetris.ShapeFactory;
import com.prototype.tetris.ShapePrototypeFactory;
import com.prototype.tetris.shapes.Shape;
import com.prototype.tetris.shapes.normal_shapes.*;
import com.prototype.tetris.shapes.special_shapes.*;


import java.util.ArrayList;
import java.util.Collection;

public final class Main {

    private Main() {}

    private static ArrayList<Shape> _shapes;

    private static ShapeFactory makeNormalPieceFactory() {
        //Shape i, Shape j, Shape l, Shape o, Shape s, Shape t, Shape z
        return new ShapePrototypeFactory(
                new IShape(), new JShape(),
                new LShape(), new OShape(),
                new SShape(), new TShape(),
                new ZShape()
        );
    }

    private static ShapeFactory makeSpecialPieceFactory() {
        return new ShapePrototypeFactory(
                new SpecialIShape(), new SpecialJShape(),
                new SpecialLShape(), new SpecialOShape(),
                new SpecialSShape(), new SpecialTShape(),
                new SpecialZShape()
        );
    }

    private static ShapeFactory makeMixedPieceFactory() {
        return new ShapePrototypeFactory(
                new SpecialIShape(), new JShape(),
                new SpecialLShape(), new OShape(),
                new SpecialSShape(), new TShape(),
                new SpecialZShape()
        );
    }

    private static void makeTetrisPieces(ShapeFactory factory) {
        _shapes = new ArrayList<>();

        _shapes.add(factory.makeIShape(Shape.Orientation.UP));
        _shapes.add(factory.makeJShape(Shape.Orientation.RIGHT));
        _shapes.add(factory.makeLShape(Shape.Orientation.DOWN));
        _shapes.add(factory.makeOShape(Shape.Orientation.LEFT));
        _shapes.add(factory.makeSShape(Shape.Orientation.UP));
        _shapes.add(factory.makeTShape(Shape.Orientation.RIGHT));
        _shapes.add(factory.makeZShape(Shape.Orientation.LEFT));

        printPieces(_shapes);
    }

    private static void printPieces(Collection<Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        makeTetrisPieces(makeNormalPieceFactory());
        makeTetrisPieces(makeSpecialPieceFactory());
        makeTetrisPieces(makeMixedPieceFactory());
    }
}
