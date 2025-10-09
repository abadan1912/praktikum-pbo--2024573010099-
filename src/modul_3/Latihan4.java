package modul_3;

import java.util.Arrays;

public class Latihan4 {

    static int maksimum(int[] a) {
        int m = a[0];
        for (int v : a) if (v > m) m = v;
        return m;
    }

    static int minimum(int[] a) {
        int m = a[0];
        for (int v : a) if (v < m) m = v;
        return m;
    }

    static double rataRata(int[] a) {
        long s = 0; for (int v : a) s += v;
        return (double) s / a.length;
    }

    static void sortNaik(int[] a) {
        // Bubble Sort singkat
        boolean sw;
        for (int i = 0; i < a.length - 1; i++) {
            sw = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) { int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t; sw = true; }
            }
            if (!sw) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {78, 64, 90, 82, 73, 88, 95};

        System.out.println("Data awal : " + Arrays.toString(data));
        sortNaik(data);
        System.out.println("Diurutkan: " + Arrays.toString(data));
        System.out.println("Maksimum : " + maksimum(data));
        System.out.println("Minimum  : " + minimum(data));
        System.out.println("Rata-rata: " + String.format("%.2f", rataRata(data)));
    }
}

