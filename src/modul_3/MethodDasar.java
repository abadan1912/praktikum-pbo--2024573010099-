package modul_3;

import java.util.Scanner;

public class MethodDasar {

    static void tampilkanHeader() {
        System.out.println("=== Program Operasi Matematika Dasar ===");
    }

    static void tampilkanHasil(String judul, double nilai) {
        System.out.println(judul + ": " + nilai);
    }

    static boolean validasiAngka(String s) {
        return s != null && s.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    static double tambah(double a, double b) { return a + b; }
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b)   { return a * b; }
    static double bagi(double a, double b)   { return a / b; }

    public static void main(String[] args) {
        tampilkanHeader();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        String s1 = sc.nextLine();
        System.out.print("Masukkan angka kedua  : ");
        String s2 = sc.nextLine();

        if (!validasiAngka(s1) || !validasiAngka(s2)) {
            System.out.println("Input tidak valid. Hanya angka yang diperbolehkan.");
            sc.close();
            return;
        }

        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);

        tampilkanHasil("Tambah", tambah(a, b));
        tampilkanHasil("Kurang", kurang(a, b));
        tampilkanHasil("Kali",   kali(a, b));

        if (b == 0) System.out.println("Bagi: tidak bisa membagi dengan nol.");
        else tampilkanHasil("Bagi", bagi(a, b));

        sc.close();
    }
}
