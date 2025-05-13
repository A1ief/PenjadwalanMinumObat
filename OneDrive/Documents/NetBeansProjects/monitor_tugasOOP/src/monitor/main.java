/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor;

/**
 *
 * @author WINDOWS 11
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Monitor
        monitor monitor1 = new monitor("ASUS", 27, "1440p");
        monitor monitor2 = new monitor("LG", 24, "1080p");
        monitor monitor3 = new monitor("Dell", 32, "4K");

        // Menjalankan method dari objek monitor
        monitor1.nyalakan();
        monitor1.ubahBrightness(75);
        monitor1.matikan();

        System.out.println(); // Pemisah

        monitor2.nyalakan();
        monitor2.ubahBrightness(50);
        monitor2.matikan();

        System.out.println(); // Pemisah

        monitor3.nyalakan();
        monitor3.ubahBrightness(90);
        monitor3.matikan();
    }
}
