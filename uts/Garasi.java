import java.util.ArrayList;

public class Garasi { // Class Garasi digunakan untuk menampung beberapa kendaraan
    private String namaGarasi;
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>(); // List kendaraan dalam garasi

    // Konstruktor
    public Garasi(String namaGarasi) {
        this.namaGarasi = namaGarasi;
    }

    // Menambahkan kendaraan ke dalam daftar
    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
    }

    // Menampilkan semua kendaraan yang ada di garasi
    public void tampilkanSemua() {
        System.out.println("\nDaftar Kendaraan di " + namaGarasi + ":");
        for (Kendaraan k : daftarKendaraan) {
            k.tampilInfo();  // Memanggil method tampilInfo() dari setiap kendaraan
        }
    }

}
