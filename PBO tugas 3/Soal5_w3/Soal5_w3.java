/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal5_w3;

import java.util.Scanner;

/**
 *
 * @author isala
 */
public class Soal5_w3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String platNomor1 = input.next();
        String platNomor2 = input.next();
        String platNomor3 = input.next();
        String platNomor4 = input.next();

        String gabunganPlatNomor = platNomor1 + platNomor2 + platNomor3 + platNomor4;

        long gabunganPlatNomorLong = Long.parseLong(gabunganPlatNomor);
        if ((gabunganPlatNomorLong - 999999) % 5 != 0) 
        {
            System.out.println("berhenti");
        } else 
        {
            System.out.println("jalan");
        }

        input.close();
    }
}