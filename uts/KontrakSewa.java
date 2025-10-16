class KontrakSewa { // Class KontrakSewa hubungan antara pelanggan dan kendaraan
    private int idKontrak;
    private String tglMulai;
    private String tglSelesai;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;

    // Konstruktor
    public KontrakSewa(int id, String mulai, String selesai, Pelanggan p, Kendaraan k) {
        this.idKontrak = id;
        this.tglMulai = mulai;
        this.tglSelesai = selesai;
        this.pelanggan = p;
        this.kendaraan = k;
    }

    // Menampilkan detail kontrak
    public void tampilkanKontrak() {
        System.out.println("Kontrak ID: " + idKontrak + " | Pelanggan: " + pelanggan.getNama());
        kendaraan.tampilInfo(); 
        System.out.println("Periode: " + tglMulai + " - " + tglSelesai);
    }
}
