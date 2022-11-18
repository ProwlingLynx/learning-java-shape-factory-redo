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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return (double) (getHeight() * getWidth());
    }
}
