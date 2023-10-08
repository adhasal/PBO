/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author isala
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestaurantMain {
    public static void main(String[] args) {
        // Inisialisasi objek Restaurant dengan batas maksimum 10 menu
        Restaurant menu = new Restaurant(10);

        // Menambahkan menu makanan
        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        menu.tambahMenuMakanan("Gehu", 1000, 200);
        menu.tambahMenuMakanan("Tahu", 1000, 200);
        menu.tambahMenuMakanan("Molen", 1000, 200);

        // Mengatur logger
        Logger logger = Logger.getLogger(Restaurant.class.getName());

        // Menampilkan menu makanan dengan pesan log
        for (int i = 0; i < menu.getCurrentMenuId(); i++) {
            if (!menu.isOutOfStok(i)) {
                String logMessage = menu.getNamaMakanan(i) + "[" + menu.getStok(i) + "]\tRp. " + menu.getHargaMakanan(i);
                logger.log(Level.INFO, logMessage);
            }
        }
    }
}
