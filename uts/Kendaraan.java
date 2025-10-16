public class Kendaraan { // Class induk (superclass)
    private String merk;
    private int tahun;
    private double hargaSewa;

    // Konstruktor
    public Kendaraan(String merk, int tahun, double hargaSewa) {
        this.merk = merk; 
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
    }

    // Getter dan Setter
    public String getMerk() { return merk; }
    public int getTahun() { return tahun; }
    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }

    // Method yang bisa dioverride oleh subclass
    public void tampilInfo() {
        System.out.println("Kendaraan: " + merk + " (" + tahun + ")");
    }

    // Method overloading:  Menghitung biaya sewa berdasarkan jumlah hari
    public double hitungBiayaSewa(int hari) {
        return hargaSewa * hari;
    }
    // Menghitung biaya sewa dengan tambahan parameter diskon
    public double hitungBiayaSewa(int hari, double diskon) {
        return (hargaSewa * hari) - diskon;
    }
}
