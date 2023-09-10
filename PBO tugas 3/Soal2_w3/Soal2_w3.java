/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_w3;

import java.util.Scanner;

/**
 *
 * @author isala
 */
public class Soal2_w3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String kata[] = new String[3];
        int angka[] = new int[3];

        for (int i = 0; i < 3; i++) 
        {
            kata[i] = sc.next();
            angka[i] = sc.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) 
        {
            System.out.printf("%-15s%03d%n", kata[i], angka[i]);
        }
        System.out.println("================================");

        sc.close();
    }
}
