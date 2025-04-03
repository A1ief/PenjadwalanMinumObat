/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengingatObat;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah obat yang ingin dimasukkan
        System.out.print("Masukkan jumlah obat: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        // Array untuk menyimpan daftar obat
        Obat[] daftarObat = new Obat[jumlah];

        // Input data obat dari pengguna
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Obat ke-" + (i + 1));
            System.out.print("Masukkan nama obat: ");
            String nama = input.nextLine();
            System.out.print("Masukkan jadwal minum obat (contoh: Pagi, Siang, Malam): ");
            String jadwal = input.nextLine();

            System.out.print("Apakah ini obat resep? (ya/tidak): ");
            String jenis = input.nextLine().toLowerCase();

            if (jenis.equals("ya")) {
                System.out.print("Masukkan nama dokter: ");
                String dokter = input.nextLine();
                    System.out.print("Masukkan nomor resep: ");
                String resep = input.nextLine();
                daftarObat[i] = new obatResep(nama, jadwal, dokter, resep);
            } else {
                System.out.print("Masukkan kategori obat (Analgesik, Vitamin, Antibiotik, dll.): ");
                String kategori = input.nextLine();
                daftarObat[i] = new obatBebas(nama, jadwal, kategori);
            }
        }

        // Menampilkan daftar obat
        System.out.println("\n=== Jadwal Minum Obat ===");
        for (Obat obat : daftarObat) {
            obat.tampilkanInfo();
        }

        input.close();
    }
}
