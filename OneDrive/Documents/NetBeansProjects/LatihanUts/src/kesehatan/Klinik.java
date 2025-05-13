package kesehatan;

public class Klinik {
    private String namaKlinik;
    private Dokter dokter;

    public Klinik(String namaKlinik, Dokter dokter) {
        this.namaKlinik = namaKlinik;
        this.dokter = dokter;
    }

    public void tampilkanInfoKlinik() {
        System.out.println("\n=== Info Klinik ===");
        System.out.println("Nama Klinik: " + namaKlinik);
        System.out.println("Dokter Bertugas:");
        dokter.tampilkanInfo();
    }
}