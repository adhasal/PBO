/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isala
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        // Default constructor with default values
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        // Constructor with a specified radius and default color
        this.radius = r;
        color = "red";
    }

    // Constructor with specified radius and color
    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Getter for color
    public String getColor() {
        return color;
    }

    // Calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override the toString method to provide a descriptive string representation
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

}

