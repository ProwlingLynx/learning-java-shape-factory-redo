package shape;

import base.IShape;

import java.text.DecimalFormat;

public class Triangle implements IShape {
    int height, base;
    String name;

    public Triangle(int height, int base, String name) {
        this.height = height;
        this.base = base;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    @Override
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat("0.00");
        String output = df.format(getHeight() * getBase()/2);
        return Double.parseDouble(output);
    }
}
