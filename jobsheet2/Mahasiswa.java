public class Mahasiswa{
    public String nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void displayBiodata(){ //method menampilkan biodata mahasiswa
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Kelas   : " + kelas);
    }
}