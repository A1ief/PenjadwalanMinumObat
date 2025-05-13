package kesehatan;

public class Orang {
    protected String nama;
    protected int umur;

    // Constructor
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}