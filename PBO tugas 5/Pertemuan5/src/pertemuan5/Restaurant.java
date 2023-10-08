/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author isala
 */
import java.util.logging.Level;
import java.util.logging.Logger;


public class Restaurant {

    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private int maxMenu; // Maksimum jumlah menu yang dapat ditambahkan
    private int currentMenuId;
    private static final Logger LOGGER = Logger.getLogger(Restaurant.class.getName());

    public Restaurant(int maxMenu) {
        this.maxMenu = maxMenu;
        nama_makanan = new String[maxMenu];
        harga_makanan = new double[maxMenu];
        stok = new int[maxMenu];
        currentMenuId = 0;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (currentMenuId < maxMenu) {
            this.nama_makanan[currentMenuId] = nama;
            this.harga_makanan[currentMenuId] = harga;
            this.stok[currentMenuId] = stok;
            currentMenuId++;
        } else {
            LOGGER.log(Level.INFO, "Menu penuh, tidak bisa menambahkan lagi.");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < currentMenuId; i++) {
            if (!isOutOfStok(i)) {
                LOGGER.log(Level.INFO, "Menu: {0} [{1}] Rp. {2}", 
                    new Object[] { nama_makanan[i], stok[i], harga_makanan[i] });
            }
        }
    }

    boolean isOutOfStok(int id) {
        return stok[id] == 0;
    }

    public String getNamaMakanan(int id) {
        return nama_makanan[id];
    }

    public int getStok(int id) {
        return stok[id];
    }

    public double getHargaMakanan(int id) {
        return harga_makanan[id];
    }

    public int getCurrentMenuId() {
        return currentMenuId;
    }
}
