package Pertemuan3;

public class Komik1 extends Buku {
    private int eps;
    private String genre;

    public Komik1(String judul, String penulis, int eps, String genre) {
        super(judul, penulis, 0, "Komik"); // tahun dan kategori dummy
        this.eps = eps;
        this.genre = genre;
    }
    
    //Bab5 Override
    @Override
    public void tampilkanInfo() {
        System.out.println("Judul       : " + getJudul());
        System.out.println("Penulis     : " + getPenulis());
        System.out.println("Episode     : " + eps);
        System.out.println("Genre       : " + genre);
        System.out.println("----------------------------------");
    }

    // Bab5 Overloading
    public void tampilkanInfo(boolean ringkas) {
        if (ringkas) {
            System.out.println("Komik: " + getJudul() + " - eps " + eps);
        } else {
            tampilkanInfo();
        }
    }
}
