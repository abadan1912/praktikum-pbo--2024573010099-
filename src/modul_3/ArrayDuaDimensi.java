package modul_3;

import java.util.Arrays;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        // 3 siswa × 4 mapel
        int[][] nilai = {
                {80, 75, 90, 85},  // Siswa 1
                {70, 88, 76, 92},  // Siswa 2
                {95, 81, 84, 77}   // Siswa 3
        };

        System.out.println("Struktur: " + nilai.length + " siswa × " + nilai[0].length + " mata pelajaran");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + " -> " + Arrays.toString(nilai[i]));
        }
    }
}
