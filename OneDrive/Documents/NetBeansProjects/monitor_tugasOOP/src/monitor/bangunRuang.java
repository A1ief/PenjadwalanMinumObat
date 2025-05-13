/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitor;

/**
 *
 * @author WINDOWS 11
 */

class Balok {
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    
    // Konstruktor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method untuk menghitung volume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    // Method untuk menampilkan hasil
    public void tampilkanVolume() {
        System.out.println("Volume balok dengan panjang " + panjang + 
                         ", lebar " + lebar + 
                         ", dan tinggi " + tinggi + 
                         " adalah: " + hitungVolume());
    }
}

// Kelas turunan (child class) untuk Kubus
class Kubus extends Balok {
    // Konstruktor untuk Kubus
    public Kubus(double sisi) {
        // Memanggil konstruktor parent class dengan semua parameter sama (sisi)
        super(sisi, sisi, sisi);
    }
    
    // Override method tampilkanVolume untuk Kubus
    @Override
    public void tampilkanVolume() {
        System.out.println("Volume kubus dengan sisi " + panjang + 
                         " adalah: " + hitungVolume());
    }
}

public class bangunRuang {
    public static void main(String[] args) {
        // Membuat objek balok
        Balok balok1 = new Balok(5, 3, 2);
        balok1.tampilkanVolume();
        
        // Membuat objek kubus
        Kubus kubus1 = new Kubus(4);
        kubus1.tampilkanVolume();
    }
}

