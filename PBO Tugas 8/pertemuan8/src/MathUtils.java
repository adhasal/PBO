/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author isala
 */
public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Argument is too large; Factorial is only defined for arguments up to 16.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}

