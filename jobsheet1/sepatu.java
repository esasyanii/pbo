public class sepatu {
    public static void main(String[] args) {
        String merk1, warna1, jenis1, bahan1, merk2, warna2, jenis2, bahan2;
        int ukuran1, ukuran2;

        merk1 = "adidas";
        warna1 = "hitam";
        jenis1 = "tali";
        bahan1 = "kulit";
        ukuran1 = 37;

        merk2 = "puma";
        warna2 = "merah";
        jenis2 = "slip on";
        bahan2 = "kain tekstil";
        ukuran2 = 39;

        ukuran1 = tambahkanUkuran1(ukuran1, 5);
        ukuran2 = kurangiUkuran2(ukuran2, 2);

        System.out.println("==========================");
        System.out.println("Merk    :" + merk1);
        System.out.println("warna   :" + warna1);
        System.out.println("jenis   :" + jenis1);
        System.out.println("bahan   :" + bahan1);
        System.out.println("ukuran  :" + ukuran1);
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        System.out.println("Merk    :" + merk2);
        System.out.println("warna   :" + warna2);
        System.out.println("jenis   :" + jenis2);
        System.out.println("bahan   :" + bahan2);
        System.out.println("ukuran  :" + ukuran2);
        System.out.println("===========================");
    }

    public static int tambahkanUkuran1(int ukuran1, int increment){
     ukuran1 += increment;
     return ukuran1;
    }

        public static int kurangiUkuran2(int ukuran2, int decrement){
            ukuran2 -= decrement;
            return ukuran2;
        }
}