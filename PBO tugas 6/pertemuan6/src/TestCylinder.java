/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isala
 */
public class TestCylinder {
    public static void main(String[] args) {
        // Create Cylinder objects with different parameters
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10.0);
        Cylinder c3 = new Cylinder(2.0, 10.0);

        // Display information for each Cylinder
        displayCylinderInfo("Cylinder 1", c1);
        displayCylinderInfo("Cylinder 2", c2);
        displayCylinderInfo("Cylinder 3", c3);
    }

    // Helper method to display cylinder information
    public static void displayCylinderInfo(String cylinderName, Cylinder cylinder) {
        System.out.println(cylinderName + ":");
        System.out.println(cylinder);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Base Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println();
    }
}

