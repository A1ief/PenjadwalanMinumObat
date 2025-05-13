package Pertemuan3;

public class Novel1 extends Buku {
    private String genre;

    public Novel1(String judul, String penulis, int tahunTerbit, String genre) {
        super(judul, penulis, tahunTerbit, "Novel");
        this.genre = genre;
    }
    
    // Bab5 Override
    @Override
    public void tampilkanInfo() {
        System.out.println("Judul       : " + getJudul());
        System.out.println("Penulis     : " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.println("Genre       : " + genre);
        System.out.println("----------------------------------");
    }

    // Bab5 Overloading
    public void tampilkanInfo(boolean ringkas) {
        if (ringkas) {
            System.out.println("Novel: " + getJudul() + " - " + genre);
        } else {
            tampilkanInfo();
        }
    }
}
