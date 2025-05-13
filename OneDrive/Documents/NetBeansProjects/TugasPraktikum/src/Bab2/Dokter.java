/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author WINDOWS 11
 */
public class Dokter {
    // Atribut private Bab4 enkapsulasi
    private String namaDokter;
    
    // Konstruktor
    public Dokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }
    
    // Bab4 Getter untuk mengambil nilai namaDokter
    public String getNamaDokter() {
        return namaDokter;
    }
    
    // Bab4 Setter untuk mengubah nilai namaDokter
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }
}
