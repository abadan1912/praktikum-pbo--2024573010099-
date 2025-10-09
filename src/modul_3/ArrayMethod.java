package modul_3;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayMethod {

    static int[] inputArray(Scanner sc) {
        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Masukkan " + n + " bilangan integer:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    static void tampilkanArray(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }

    static int cariMaksimum(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }

    static int cariMinimum(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }

    static double hitungRataRata(int[] arr) {
        long sum = 0;
        for (int v : arr) sum += v;
        return (double) sum / arr.length;
    }

    static void urutkanArray(int[] arr) {
        // Bubble Sort dasar
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = inputArray(sc);
        tampilkanArray(data);

        System.out.println("Maksimum : " + cariMaksimum(data));
        System.out.println("Minimum  : " + cariMinimum(data));
        System.out.println("Rata-rata: " + String.format("%.2f", hitungRataRata(data)));

        urutkanArray(data);
        System.out.print("Setelah diurutkan: ");
        tampilkanArray(data);

        sc.close();
    }
}
