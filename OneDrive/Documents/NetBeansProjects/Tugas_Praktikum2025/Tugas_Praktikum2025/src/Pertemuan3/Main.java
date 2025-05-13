package Pertemuan3; 
import java.util.ArrayList; 

public class Main { 
    public static void main(String[] args){ 
         // Membuat daftar buku menggunakan ArrayList 
        ArrayList<Buku> daftarBuku = new ArrayList<>(); 
        ArrayList<Novel1> daftarNovel1 = new ArrayList<>();
        ArrayList<Komik1> daftarKomik1 = new ArrayList<>();
 
        // Menambahkan beberapa buku ke dalam daftar 
        daftarBuku.add(new Buku("Pemrograman Java", "John Doe", 2020, "Teknologi")); 
        daftarBuku.add(new Buku("Data Analis untuk pemula", "Jane Smith", 2022, "Teknologi")); 
        daftarBuku.add(new Buku("Apa itu OOP","zahra", 2023,"Sejarah")); 
        daftarBuku.add(new Buku("Pemrograman Dasar", "john Wick", 2024, "Fiksi")); 
 
        
        // Menambahkan beberapa novel ke dalam daftar
        daftarNovel1.add(new Novel1("Laut Bercerita", "Leila S. Chudori", 2017, "Fiksi"));
        daftarNovel1.add(new Novel1("Cantik Itu Luka", "Eka Kurniawan", 2002, "Fiksi, fiksi sejarah, realisme"));
        
        
        // Menambahkan beberapa komik ke dalam daftar 
         daftarKomik1.add(new Komik1("Naruto Shippuden", "Hayato Date", 500, "anime aksi, fantasi, petualangan"));
         daftarKomik1.add(new Komik1("One piece", "Eiichiro Oda", 1122, "fantasi, petualangan"));
         
         
        // Menampilkan daftar buku yang tersedia 
        System.out.println("=== Perpustakaan Buku Digital===\n"); 
        for (Buku buku : daftarBuku) { 
            buku.tampilkanInfo();      
        } 
        
        System.out.println("=== Daftar Novel===\n"); 
        for (Novel1 novel : daftarNovel1) { 
            novel.tampilkanInfo(); 
    } 
        
        System.out.println("=== Daftar Komik===\n"); 
        for (Komik1 komik1 : daftarKomik1) { 
            komik1.tampilkanInfo(); 
    } 
} 
}
