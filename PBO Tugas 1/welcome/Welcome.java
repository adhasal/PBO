/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome;

/**
 *
 * @author isala
 */


public class Welcome
{

	public static void main(String[] args)
	{
		String greeting = "Welcome to Core Java!";  // Mendefinisikan sebuah string yang berisi pesan selamat datang
		System.out.println(greeting); // Menampilkan pesan selamat datang ke layar
		for (int i=0; i<greeting.length(); i++) // Menggunakan perulangan untuk menampilkan garis pemisah sepanjang panjang pesan selamat datang
			System.out.print("=");
		System.out.println();   // Pindah ke baris baru setelah menampilkan garis pemisah
	}
}