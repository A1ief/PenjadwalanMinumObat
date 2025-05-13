package kesehatan;

public class Main {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Ani", 25, "Demam");
        Dokter dokter1 = new Dokter("Dr. Budi", 45, "Umum");
        Klinik klinik1 = new Klinik("Klinik Sehat", dokter1);

        System.out.println("=== Data Pasien ===");
        pasien1.tampilkanInfo();

        System.out.println("\n=== Data Dokter ===");
        dokter1.tampilkanInfo("Senin - Jumat");

        klinik1.tampilkanInfoKlinik();
    }
}