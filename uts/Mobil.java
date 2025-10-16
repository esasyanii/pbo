public class Mobil extends Kendaraan {
    private int kapasitas; // Jumlah penumpang maksimal

    public Mobil(String merk, int tahun, double hargaSewa, int kapasitas) {
        super(merk, tahun, hargaSewa); // Memanggil konstruktor superclass
        this.kapasitas = kapasitas;
    }

    @Override //Memberi tahu compiler bahwa method ini memang mau menimpa method dari superclass
    public void tampilInfo() {
        System.out.println("Mobil: " + getMerk() + " (" + getTahun() + "), Kapasitas: " + kapasitas + " orang");
    }
}
