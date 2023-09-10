/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_w3;

import java.util.Scanner;

/**
 *
 * @author isala
 */
public class Soal3_w3 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) 
 {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        String operator = input.next();
        int B = input.nextInt();
        
        int hasil = 0;
        
        if (operator.equals("+")) 
        {
            hasil = A + B;
        }
        if (operator.equals("-")) 
        {
            hasil = A - B;
        }
        if (operator.equals("*")) 
        {
            hasil = A * B;
        }
        if (operator.equals("/")) 
        {
            hasil = A / B;
        }
        if (operator.equals("%")) 
        {
            hasil = A % B;
        }
        
        System.out.println(hasil);
        
        input.close();
    }
}