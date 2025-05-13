/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author WINDOWS 11
 */
public class Mahasiswa {
    private String nim, nama, jenisKelamin, prodi, angkatan, alamat;

    public void dataNIM(String nim) {
        this.nim = nim;
    }

    public void dataNama(String nama) {
        this.nama = nama;
    }

    public void dataJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void dataProdi(String prodi) {
        this.prodi = prodi;
    }

    public void dataAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void dataAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String cetakNIM() {
        return nim;
    }

    public String cetakNama() {
        return nama;
    }

    public String cetakJenisKelamin() {
        return jenisKelamin;
    }

    public String cetakProdi() {
        return prodi;
    }

    public String cetakAngkatan() {
        return angkatan;
    }

    public String cetakAlamat() {
        return alamat;
    }
}
