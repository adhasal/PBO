/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1_w3;
import java.util.*;
/**
 *
 * @author isala
 */
public class Soalno1_w3 
{

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
         Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        s = s.trim(); 
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String [] words = s.split("[^a-zA-Z]+");
        
        System.out.println(words.length);
        for (String word : words) 
        {
            System.out.println(word);
        }
}
}