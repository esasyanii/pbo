public class PersegiPanjang {
    //atribut persegi panjang
    public int panjang;
    public int lebar;

    //method menampilkankan panjang dan lebar
    public void displayInfo(){
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar  : " + lebar);
    }

    //method untuk menghitung luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }

    //method untuk menghitung keliling persegi panjang
    public int getKeliling(){
        return 2 * (panjang + lebar);
    }
}
