package test;

import shape.Circle;
import shape.Square;
import shape.Triangle;

public class Test {
    public static void main(String[] args) {
        Square square = new Square("square", 5, 5);
        Circle circle = new Circle("circle", 8);
        Triangle triangle = new Triangle(9, 3, "triangle");
        System.out.println("The square has an area of: " + square.calculateArea());
        System.out.println("The circle has an area of: " + circle.calculateArea());
        System.out.println("The triangle has an area of: " + triangle.calculateArea());
    }

}