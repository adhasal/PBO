/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author isala
 */
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                int factorialResult = MathUtils.factorial(val);
                System.out.println("Factorial(" + val + ") = " + factorialResult);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}

