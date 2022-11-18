package shape;

import base.IShape;

public class Square implements IShape {
    private String Name;
    private int height, width;

    public Square(String name, int height, int width) {
        Name = name;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return getHeight() * getWidth();
    }
}
