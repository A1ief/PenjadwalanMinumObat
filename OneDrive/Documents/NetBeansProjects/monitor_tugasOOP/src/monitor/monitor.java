/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor;

/**
 *
 * @author WINDOWS 11
 */
public class monitor {
    // Atribut
    private String merek;
    private int ukuranLayar;
    private String resolusi;

    // Constructor
    public monitor(String merek, int ukuranLayar, String resolusi) {
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.resolusi = resolusi;
    }

    // Method untuk menyalakan monitor
    public void nyalakan() {
        System.out.println(merek + " dengan ukuran " + ukuranLayar + " inch dan resolusi " + resolusi + " sedang menyala.");
    }

    // Method untuk mematikan monitor
    public void matikan() {
        System.out.println(merek + " dimatikan.");
    }

    // Method untuk mengubah brightness
    public void ubahBrightness(int level) {
        System.out.println("Brightness monitor " + merek + " diubah ke level " + level + ".");
    }
}
