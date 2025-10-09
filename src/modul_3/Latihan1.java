package modul_3;

public class Latihan1 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85, 95, 70};

        // Tampilkan semua nilai
        System.out.print("Nilai seluruh siswa: ");
        for (int n : nilai) System.out.print(n + " ");
        System.out.println();

        // Rata-rata, maks, min
        int maks = nilai[0], min = nilai[0], total = 0;
        for (int n : nilai) {
            total += n;
            if (n > maks) maks = n;
            if (n < min) min = n;
        }
        double rata = (double) total / nilai.length;

        System.out.println("Rata-rata: " + String.format("%.2f", rata));
        System.out.println("Tertinggi: " + maks);
        System.out.println("Terendah : " + min);
    }
}

