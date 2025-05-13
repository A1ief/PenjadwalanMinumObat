package Pertemuan3;

public class Buku {

    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String kategori;

    // Konstruktor 
    public Buku(String judul, String penulis, int tahunTerbit,
            String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    // Getter untuk mendapatkan informasi buku 
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    // Metode untuk menampilkan informasi buku 
    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori    : " + kategori);
        System.out.println("----------------------------------");
    }

    // Overloading Bab5 - tampilkanInfo versi singkat
    public void tampilkanInfo(boolean singkat) {
        if (singkat) {
            System.out.println("Judul: " + judul + ", Penulis: " + penulis);
        } else {
            tampilkanInfo(); // panggil versi lengkap
        }
    }

}
