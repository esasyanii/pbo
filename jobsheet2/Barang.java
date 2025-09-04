public class Barang {
    //atribut
 public String kode;
 public String nama;
 public double hargaKotor;
 public double diskon;   

 // Method untuk menghitung harga setelah diskon
 public double getHargaBersih(){
    return hargaKotor - diskon * hargaKotor;
 }

 // Method menampilkan informasi barang
  public void displayInfo(){
    System.out.println("===========================");
    System.out.println("Kode        : " + kode);
    System.out.println("Nama        : " + nama);
    System.out.println("Harga Asli  :" + hargaKotor);
    System.out.println("Diskon      : " + diskon);
    System.out.println("Harga Bersih: " + getHargaBersih());
    System.out.println("===========================");
 }
}
