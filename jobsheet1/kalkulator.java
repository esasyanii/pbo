import java.util.Scanner;
public class kalkulator {

    static double tambah(double a, double b) {
        return a + b;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }

    static double hitung(double angka1, String operator, double angka2) {
        switch (operator) {
            case "+":
                return tambah(angka1, angka2);
            case "-":
                return kurang(angka1, angka2);
            case "*":
                return kali(angka1, angka2);
            case "/":
                return bagi(angka1, angka2);
            default:
                System.out.println("Operator tidak valid!");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = hitung(angka1, operator, angka2);

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
