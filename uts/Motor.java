public class Motor extends Kendaraan { // Subclass Motor mewarisi dari Kendaraan
    private String tipe;

    // Konstruktor
    public Motor(String merk, int tahun, double hargaSewa, String tipe) {
        super(merk, tahun, hargaSewa);
        this.tipe = tipe;
    }

    @Override //Memberi tahu compiler bahwa method ini memang mau menimpa method dari superclass
    public void tampilInfo() {
        System.out.println("Motor: " + getMerk() + " (" + getTahun() + "), Tipe: " + tipe);
    }
}