package exercise1.Factories;

import exercise1.Shapes.Circle;
import exercise1.Shapes.Shape;

import java.util.List;

public class CircleFactory implements IShapeFactory {

    @Override
    public Shape createFigure(List<Double> params) {
        return new Circle(params);
    }
}