/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addnum;

import java.io.*;

/**
 * <h1>Add Two Numbers!</h1>
 * the AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen
 * 
 * @author isala
 */
public class AddNum {
    /**
     * 
     * @param numA
     * @param numB
     * @return 
     */
    public int addNum(int numA, int numB) {
        return numA + numB;
    }
    
/**
 * This is main method which makes use of addNum method.
 * @param args Unused
 * @exception IOException  on input error.
 * @see IOException.
 */   
    public static void main(String args[]) throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);
        System.out.println("Sum of 10 and 20 is :" + sum);
    }
}
