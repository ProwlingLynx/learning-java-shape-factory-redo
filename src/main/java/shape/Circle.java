package shape;

import base.IShape;

import java.text.DecimalFormat;

public class Circle implements IShape {
    private double radius;
    static final double PI = Math.PI;
    private String name;

    public Circle(String name, double radius) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        double area = getRadius() * Circle.PI;
        DecimalFormat df = new DecimalFormat("0.00");

        return Double.parseDouble(df.format(area));
    }
}
