package test;

import shape.Circle;
import shape.Square;

public class Test {
    public static void main(String[] args) {
        Square square = new Square("square", 5, 5);
        Circle circle = new Circle("circle", 8);
        System.out.println("The square has an area of: " + square.calculateArea());
        System.out.println("The circle has an are of: " + circle.calculateArea());
    }

}