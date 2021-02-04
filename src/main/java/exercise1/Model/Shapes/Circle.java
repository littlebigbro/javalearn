package exercise1.Model.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(List<Double> params) {
        super(params);
        init();
    }

    public Circle(int id, List<Double> params) {
        super(id, params);
        init();
    }

    private void init() {
        this.name = ShapeTypes.CIRCLE.toString();
        this.ruName = ShapeTypes.CIRCLE.getRuName();
        this.center.setX(params.get(0));
        this.center.setY(params.get(1));
        points = new ArrayList<>();
        points.add(center);
        this.radius = params.get(2);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void move(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public void changeSize(double scaleFactor) {
        this.radius *= scaleFactor;
    }

    @Override
    public void roll(double angle) {
    }
}