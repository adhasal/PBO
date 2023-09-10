/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal4_w3;

import java.util.Scanner;

/**
 *
 * @author isala
 */
public class Soal4_w3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
     {
        Scanner input = new Scanner(System.in);

        int jumlahPenjualan = input.nextInt();
        int hargaPerItem = 50000;
        int gajiPokok = 500000;
        double bonus = 0;
        
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) 
        {
            bonus = jumlahPenjualan * hargaPerItem * 0.25;
        }
        if (jumlahPenjualan > 80) 
        {
            bonus = jumlahPenjualan * hargaPerItem * 0.35;
        }
        if (jumlahPenjualan < 15) 
        {
            bonus = (jumlahPenjualan - 15) * hargaPerItem * 0.15;
        }
        if (jumlahPenjualan >= 15 && jumlahPenjualan < 40) 
        {
            bonus = jumlahPenjualan * hargaPerItem * 0.10;
        }
        
        double totalGaji = gajiPokok + bonus;
        
        System.out.println((int)totalGaji);
        
        input.close();
    }
}