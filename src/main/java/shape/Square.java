package shape;

import base.IShape;

public class Square implements IShape {
    String Name;
    int height, width;

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

    public double calculateArea() {
        return (double) (getHeight() * getWidth());
    }
}
