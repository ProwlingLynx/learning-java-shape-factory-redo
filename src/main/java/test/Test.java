package test;

import shape.Square;

public class Test {
    public static void main(String[] args) {
        Square square = new Square("square", 5, 5);
        System.out.println(square.calculateArea());
    }

}