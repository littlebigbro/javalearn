package exercise1.Model.Factories;

import exercise1.Model.Shapes.Circle;
import exercise1.Model.Shapes.Shape;

import java.util.List;

public class CircleFactory implements IShapeFactory {

    @Override
    public Shape createFigure(List<Double> params) {
        return new Circle(params);
    }

    @Override
    public Shape createFigure(int id, List<Double> params) {
        return new Circle(id, params);
    }
}
