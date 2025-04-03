/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengingatObat;

/**
 *
 * @author WINDOWS 11
 */
public class obatBebas extends Obat {
    private String kategori;

    // Constructor
    public obatBebas(String nama, String jadwal, String kategori) {
        super(nama, jadwal); // Memanggil constructor superclass
        this.kategori = kategori;
    }

    // Getter untuk kategori obat
    public String getKategori() {
        return kategori;
    }

    // Override metode tampilkanInfo untuk menampilkan tambahan kategori obat
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil metode dari superclass
        System.out.println("Kategori    : " + kategori);
        System.out.println("--------------------------");
    }
}
