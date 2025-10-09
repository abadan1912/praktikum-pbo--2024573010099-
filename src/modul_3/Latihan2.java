package modul_3;

public class Latihan2 {
    public static void main(String[] args) {
        String[] mapel = {"Matematika", "Fisika", "Kimia", "Inggris"};
        int[][] nilai = {
                {80, 75, 90, 85},
                {70, 88, 76, 92},
                {95, 81, 84, 77}
        };

        // Mapel nilai tertinggi per siswa
        for (int i = 0; i < nilai.length; i++) {
            int maks = nilai[i][0], idxMapel = 0;
            for (int j = 1; j < nilai[i].length; j++) {
                if (nilai[i][j] > maks) { maks = nilai[i][j]; idxMapel = j; }
            }
            System.out.println("Siswa " + (i + 1) + " tertinggi di " + mapel[idxMapel] + " = " + maks);
        }

        // Rata-rata per mata pelajaran
        for (int j = 0; j < mapel.length; j++) {
            int total = 0;
            for (int i = 0; i < nilai.length; i++) total += nilai[i][j];
            double rata = (double) total / nilai.length;
            System.out.println("Rata-rata " + mapel[j] + " = " + String.format("%.2f", rata));
        }
    }
}

