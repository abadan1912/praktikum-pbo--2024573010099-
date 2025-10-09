package modul_3;

public class Latihan3 {

    static double penjumlahan(double a, double b) { return a + b; }
    static double pengurangan(double a, double b) { return a - b; }
    static double perkalian(double a, double b)   { return a * b; }

    static Double pembagian(double a, double b) {
        if (b == 0) return null; // validasi pembagian nol
        return a / b;
    }

    public static void main(String[] args) {
        double x = 12, y = 3;

        System.out.println("Penjumlahan: " + penjumlahan(x, y));
        System.out.println("Pengurangan: " + pengurangan(x, y));
        System.out.println("Perkalian  : " + perkalian(x, y));

        Double hasilBagi = pembagian(x, y);
        System.out.println("Pembagian  : " + (hasilBagi == null ? "Error (bagi nol)" : hasilBagi));
    }
}

