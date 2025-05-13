/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args){
         // Membuat daftar buku menggunakan ArrayList
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        // Menambahkan beberapa buku ke dalam daftar
        daftarBuku.add(new Buku("Pemrograman Java", "John Doe", 2020, "Teknologi"));
        daftarBuku.add(new Buku("Data Analis untuk pemula", "Jane Smith", 2022, "Teknologi"));
        daftarBuku.add(new Buku("Apa itu OOP","zahra", 2023, "Sejarah"));
        daftarBuku.add(new Buku("Pemrograman Dasar", "john Wick", 2024, "Fiksi"));

        // Menampilkan daftar buku yang tersedia
        System.out.println("=== Perpustakaan Buku Digital ===\n");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
        }
    }
}
