/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author WINDOWS 11
 */
public class CLI_CetakKTM {
    public static void main(String[] args) {
        // Membuat objek mhs dari kelas Mahasiswa
        Mahasiswa mhs = new Mahasiswa(); 

        // Memasukkan data mahasiswa
        mhs.dataNIM("2318045");
        mhs.dataNama("Mohammad Alif Albanna");
        mhs.dataJenisKelamin("Laki-laki");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2021");
        mhs.dataAlamat("Malang");

        // Mencetak KTM
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM            : " + mhs.cetakNIM()); 
        System.out.println("Nama           : " + mhs.cetakNama()); 
        System.out.println("Jenis Kelamin  : " + mhs.cetakJenisKelamin()); 
        System.out.println("Prodi          : " + mhs.cetakProdi()); 
        System.out.println("Angkatan       : " + mhs.cetakAngkatan()); 
        System.out.println("Alamat         : " + mhs.cetakAlamat()); 
    }
}
