package kesehatan;

public class Dokter extends Orang {
    private String spesialis;

    public Dokter(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    public void tampilkanInfo(String hariPraktek) {
        super.tampilkanInfo();
        System.out.println("Spesialis: " + spesialis);
        System.out.println("Hari Praktek: " + hariPraktek);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Spesialis: " + spesialis);
    }
}