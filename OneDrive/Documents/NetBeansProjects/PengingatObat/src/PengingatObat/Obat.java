package PengingatObat;

public class Obat {
    private String namaObat;
    private String jadwalMinum;

    // Constructor
    public Obat(String nama, String jadwal) {
        this.namaObat = nama;
        this.jadwalMinum = jadwal;
    }

    // Getter untuk nama obat
    public String getNamaObat() {
        return namaObat;
    }

    // Getter untuk jadwal minum obat
    public String getJadwalMinum() {
        return jadwalMinum;
    }

    // Metode untuk menampilkan informasi obat
    public void tampilkanInfo() {
        System.out.println("Nama Obat   : " + namaObat);
        System.out.println("Jadwal Minum: " + jadwalMinum);
        System.out.println("--------------------------");
    }
}
