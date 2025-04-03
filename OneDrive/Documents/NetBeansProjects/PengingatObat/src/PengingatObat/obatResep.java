/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengingatObat;

/**
 *
 * @author WINDOWS 11
 */
public class obatResep extends Obat {
    private String namaDokter,nomorResep;
    
      // Constructor
    public obatResep(String nama, String jadwal, String dokter, String resep) {
        super(nama, jadwal); // Memanggil constructor superclass
        this.namaDokter = dokter;
        this.nomorResep = resep;
    }

    // Getter untuk nama dokter
    public String getNamaDokter() {
        return namaDokter;
    }

    // Getter untuk nomor resep
    public String getNomorResep() {
        return nomorResep;
    }

    // Override metode tampilkanInfo untuk menampilkan tambahan informasi resep
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil metode dari superclass
        System.out.println("Nama Dokter : " + namaDokter);
        System.out.println("Nomor Resep : " + nomorResep);
        System.out.println("--------------------------");
    }
}
