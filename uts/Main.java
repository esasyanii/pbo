public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil dan motor (subclass dari Kendaraan)
        Mobil mobil1 = new Mobil("Toyota Avanza", 2020, 350000, 7);
        Motor motor1 = new Motor("Honda Vario", 2022, 150000, "Matic");

        // Membuat objek pelanggan dan kontrak sewa
        Pelanggan pelanggan1 = new Pelanggan("siti", "123456");

        // Membuat kontrak sewa antara pelanggan dan mobil
        KontrakSewa kontrak1 = new KontrakSewa(101, "01-10-2025", "05-10-2025", pelanggan1, mobil1);

        // Membuat garasi dan menambahkan kendaraan ke dalamnya
        Garasi garasi1 = new Garasi("Garasi Utama");
        garasi1.tambahKendaraan(mobil1);
        garasi1.tambahKendaraan(motor1);

        // Menampilkan data kontrak sewa
        System.out.println("=== DATA KONTRAK SEWA ===");
        kontrak1.tampilkanKontrak();

        // Menampilkan daftar kendaraan dalam garasi
        System.out.println("\n=== DAFTAR KENDARAAN DALAM GARASI ===");
        garasi1.tampilkanSemua();

        // Demo method overloading
        System.out.println("\n=== DEMO METHOD OVERLOADING ===");
        System.out.println("Biaya sewa 5 hari: Rp" + mobil1.hitungBiayaSewa(5));
        System.out.println("Biaya sewa 5 hari (diskon Rp50.000): Rp" + mobil1.hitungBiayaSewa(5, 50000));

        // Demo method overriding
        System.out.println("\n=== DEMO METHOD OVERRIDING ===");
        mobil1.tampilInfo(); // Memanggil versi method tampilInfo() dari subclass Mobil
        motor1.tampilInfo(); // Memanggil versi method tampilInfo() dari subclass Motor
    }
}
