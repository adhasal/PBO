/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isala
 */
public class TestShape {
    public static void main(String[] args) {

        // Membuat objek Circle
        Circle circle = new Circle(3.0, "Red", true);
        System.out.println("\nCircle:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(4.0, 5.0, "Blue", false);
        System.out.println("\nRectangle:");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Membuat objek Square
        Square square = new Square(2.5, "Green", true);
        System.out.println("\nSquare:");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}


