// Class DemoBarang
public class DemoBarang {
    public static void main(String[] args){
        // Membuat objek pertama
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1; // 10%

        // Membuat objek kedua
        Barang barang2 = new Barang();
        barang2.kode = "PS01";
        barang2.nama = "Pensil";
        barang2.hargaKotor = 2000;
        barang2.diskon = 0.15; // 15%

        // Menampilkan informasi awal
        System.out.println("=== Data Barang Awal ===");
        barang1.displayInfo();
        barang2.displayInfo();

        // Update nilai atribut
        barang1.hargaKotor = 4000;  // update harga
        barang2.nama = "Pensil 2b"; // update nama

        // Menampilkan informasi setelah update
        System.out.println("=== Data Barang Setelah Update ===");
        barang1.displayInfo();
        barang2.displayInfo();
    }
}
