public class sepatustruktural {

    public static void main(String[] args) {
        String merk1 = "Adidas", warna1 = "Hitam", jenis1 = "Bertali", bahan1 = "Kulit"; int ukuran1 = 37;
        String merk2 = "Puma", warna2 = "merah", jenis2 = "slip on", bahan2 = "kain tekstil"; int ukuran2 = 39;
        String merk3 = "Adidas", warna3 = "hijau", jenis3 = "slip on", bahan3 = "kain tekstil"; int ukuran3 = 36;
        String merk4 = "Puma", warna4 = "hitam", jenis4 = "tali", bahan4 = "kulit"; int ukuran4 = 38;
        String merk5 = "Sovella", warna5 = "putih", jenis5 = "bertali", bahan5 = "kanvas"; int ukuran5 = 35;
        String merk6 = "Sovella", warna6 = "hitam", jenis6 = "bertali", bahan6 = "kanvas"; int ukuran6 = 37;
        String merk7 = "rucas", warna7 = "biru tua", jenis7 = "slip on", bahan7 = "kulit"; int ukuran7 = 36;
        String merk8 = "rucas", warna8 = "biru putih", jenis8 = "bertali", bahan8 = "kulit"; int ukuran8 = 36;
        String merk9 = "nike", warna9 = "putih", jenis9 = "slip on", bahan9 = "kain tekstil"; int ukuran9 = 34;
        String merk10 = "nike", warna10 = "hitam", jenis10 = "bertali", bahan10 = "kain tekstil"; int ukuran10 = 37;

        ukuran7 = tambahkanUkuran1(ukuran7, 5);
        ukuran4 = tambahkanUkuran2(ukuran4, 2);

        ukuran10 = kurangiUkuran1(ukuran10, 2);
        ukuran5 = kurangiUkuran2(ukuran5, 1);

        System.out.println("==========================");
        System.out.println("Merk    :" + merk1);
        System.out.println("warna   :" + warna1);
        System.out.println("jenis   :" + jenis1);
        System.out.println("bahan   :" + bahan1);
        System.out.println("ukuran  :" + ukuran1);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk2);
        System.out.println("warna   :" + warna2);
        System.out.println("jenis   :" + jenis2);
        System.out.println("bahan   :" + bahan2);
        System.out.println("ukuran  :" + ukuran2);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk3);
        System.out.println("warna   :" + warna3);
        System.out.println("jenis   :" + jenis3);
        System.out.println("bahan   :" + bahan3);
        System.out.println("ukuran  :" + ukuran3);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk4);
        System.out.println("warna   :" + warna4);
        System.out.println("jenis   :" + jenis4);
        System.out.println("bahan   :" + bahan4);
        System.out.println("ukuran  :" + ukuran4);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk5);
        System.out.println("warna   :" + warna5);
        System.out.println("jenis   :" + jenis5);
        System.out.println("bahan   :" + bahan5);
        System.out.println("ukuran  :" + ukuran5);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk6);
        System.out.println("warna   :" + warna6);
        System.out.println("jenis   :" + jenis6);
        System.out.println("bahan   :" + bahan6);
        System.out.println("ukuran  :" + ukuran6);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk7);
        System.out.println("warna   :" + warna7);
        System.out.println("jenis   :" + jenis7);
        System.out.println("bahan   :" + bahan7);
        System.out.println("ukuran  :" + ukuran7);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk8);
        System.out.println("warna   :" + warna8);
        System.out.println("jenis   :" + jenis8);
        System.out.println("bahan   :" + bahan8);
        System.out.println("ukuran  :" + ukuran8);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk9);
        System.out.println("warna   :" + warna9);
        System.out.println("jenis   :" + jenis9);
        System.out.println("bahan   :" + bahan9);
        System.out.println("ukuran  :" + ukuran9);
        System.out.println("===========================");
        System.out.println("Merk    :" + merk10);
        System.out.println("warna   :" + warna10);
        System.out.println("jenis   :" + jenis10);
        System.out.println("bahan   :" + bahan10);
        System.out.println("ukuran  :" + ukuran10);
        System.out.println("===========================");
        System.out.println("terdapat 2 sepatu yang ukurannya ditambahkan");
        System.out.println("terdapat 2 sepatu yang ukurannya dikurangi");
    }

    public static int tambahkanUkuran1(int ukuran7, int increment){
     ukuran7 += increment;
     return ukuran7;
    }

    public static int tambahkanUkuran2(int ukuran4, int increment){
     ukuran4 += increment;
     return ukuran4;
    }

    public static int kurangiUkuran1(int ukuran10, int decrement){
        ukuran10 -= decrement;
        return ukuran10;
    }

    public static int kurangiUkuran2(int ukuran5, int decrement){
        ukuran5 -= decrement;
        return ukuran5;
    }
}