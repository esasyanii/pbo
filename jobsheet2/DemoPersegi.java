public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(); //membuat object dari persegi panjang

        //mengisi atribut
        pp1.panjang = 10;
        pp1.lebar = 5;

        //menampilkan informasi panjang dan lebar
        pp1.displayInfo();

        //menampilkan hasil perhitungan
        System.out.println("Luas    : " + pp1.getLuas());
        System.out.println("Keliling   : " + pp1.getKeliling());
    }
}
