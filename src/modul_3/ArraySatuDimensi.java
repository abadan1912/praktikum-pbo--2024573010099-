package modul_3;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        int[] nilaiSiswa = {78, 85, 92, 67, 88, 90, 73};

        // Tampilkan seluruh elemen
        System.out.print("Array nilaiSiswa: ");
        for (int n : nilaiSiswa) System.out.print(n + " ");
        System.out.println();

        // Akses elemen spesifik (contoh indeks ke-2)
        int indeks = 2;
        System.out.println("Elemen pada indeks " + indeks + " = " + nilaiSiswa[indeks]);

        // Cari nilai tertinggi & terendah (enhanced for)
        int maks = nilaiSiswa[0], min = nilaiSiswa[0];
        for (int n : nilaiSiswa) {
            if (n > maks) maks = n;
            if (n < min) min = n;
        }
        System.out.println("Nilai tertinggi: " + maks);
        System.out.println("Nilai terendah : " + min);
    }
}
