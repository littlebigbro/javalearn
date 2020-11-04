package exercise1.Shapes;

import exercise1.Utils.ClockwiseComparator;
import exercise1.Utils.Utils;

import java.util.Collections;
import java.util.List;

public class Triangle extends Shape {

    public Triangle(List<Double> params) {
        points = Utils.toPoints(params);
        center = Utils.calculateCenter(points);
        Collections.sort(points, new ClockwiseComparator(center));
    }

    @Override
    public void move(double x, double y) {
        double dX = x - this.center.getX();
        double dY = y - this.center.getY();
        for (Point point : points) {
            point.setX(point.getX() + dX);
            point.setY(point.getY() + dY);
        }
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public void roll(double angle) {
//        X = x0 + (x - x0) * cos(a) - (y - y0) * sin(a);
//        Y = y0 + (y - y0) * cos(a) + (x - x0) * sin(a);
//          где, (x0, y0) — центр, точка вокруг которой нужно вращать
        for (Point point : points) {
            point.setX(center.getX() + (point.getX() - center.getX()) * Math.cos(angle) - (point.getY() - center.getY()) * Math.sin(angle));
            point.setY(center.getY() + (point.getY() - center.getY()) * Math.cos(angle) + (point.getX() - center.getX()) * Math.sin(angle));

        }
    }

    @Override
    public void changeSize(double scaleFactor) {
        for (Point point : points) {
            point.setX(center.getX() + scaleFactor * (point.getX() - center.getX()));
            point.setY(center.getY() + scaleFactor * (point.getY() - center.getY()));
        }
    }
}