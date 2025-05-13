package kesehatan;

public class Pasien extends Orang {
    private String penyakit;

    public Pasien(String nama, int umur, String penyakit) {
        super(nama, umur);
        this.penyakit = penyakit;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penyakit: " + penyakit);
    }
}