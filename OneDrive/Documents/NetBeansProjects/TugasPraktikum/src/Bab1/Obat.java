/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author WINDOWS 11
 */
public class Obat {
    // Bab4 enkapsulasi
    private String namaObat;

    // Bab2 Konstruktor
    public Obat(String nama) {
        this.namaObat = nama;
    }

    // Bab4 Getter untuk mengambil nilai namaObat
    public String getNamaObat() {
        return namaObat;
    }

    // Bab4 Setter untuk mengubah nilai namaObat
    public void setNamaObat(String nama) {
        this.namaObat = nama;
    }
}
