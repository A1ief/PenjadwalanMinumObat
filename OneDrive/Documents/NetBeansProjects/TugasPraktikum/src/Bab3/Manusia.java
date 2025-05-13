/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3;

/**
 *
 * @author WINDOWS 11
 */
public class Manusia {
    String nama;
    int umur;   
    
    // Bab2 Konstraktor
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    // Bab4 Getter untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Bab4 Setter untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Bab4 Getter untuk mengambil nilai umur
    public int getUmur() {
        return umur;
    }

    // Bab4 Setter untuk mengubah nilai umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
