package tipedata;

public class TipeData {

}

package modul_1.tipedata;

import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        // Data dasar
        String namaLengkap = "Abadan Syakira";
        char jenisKelamin = 'L';
        LocalDate tanggalLahir = LocalDate.of(2006, 12, 19);
        int usia = 19;
        String tempatLahir = "Lhokseumawe";
        String alamat = "Blang Crum, Aceh";
        long nik = 1912245678901234L;
        long noHp = 6289644642459L;
        String email = "abadan191205@gmail.com";

        // Data akademik
        String perguruanTinggi = "Politeknik Negeri Lhokseumawe";
        String jurusan = "Teknologi Informasi dan Komputer";
        int semester = 3;
        float ipk = 3.7f;
        boolean mahasiswaAktif = true;

        // Data fisik
        double tinggiBadan = 169;
        double beratBadan = 55;

        // Data keluarga
        int jumlahSaudara = 3;
        boolean anakTunggal = false;

        // Data tambahan
        String[] hobi = {"Skateboar", "Billiard", "Membaca", "Main Game"};
        String statusPernikahan = "Belum Menikah";

        System.out.println("=== DATA DIRI ===");
        System.out.println("Nama Lengkap     : " + namaLengkap);
        System.out.println("Jenis Kelamin    : " + jenisKelamin);
        System.out.println("Tempat, Tgl Lahir: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Usia             : " + usia + " tahun");
        System.out.println("Alamat           : " + alamat);
        System.out.println("NIK              : " + nik);
        System.out.println("No. HP           : " + noHp);
        System.out.println("Email            : " + email);
        System.out.println("Status           : " + statusPernikahan);

        System.out.println("\n=== DATA AKADEMIK ===");
        System.out.println("Perguruan Tinggi : " + perguruanTinggi);
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("Semester         : " + semester);
        System.out.printf("IPK              : %.2f%n", ipk);
        System.out.println("Mahasiswa Aktif  : " + mahasiswaAktif);

        System.out.println("\n=== DATA FISIK ===");
        System.out.printf("Tinggi Badan     : %.1f cm%n", tinggiBadan);
        System.out.printf("Berat Badan      : %.1f kg%n", beratBadan);

        System.out.println("\n=== DATA KELUARGA ===");
        System.out.println("Jumlah Saudara   : " + jumlahSaudara);
        System.out.println("Anak Tunggal     : " + anakTunggal);

        System.out.println("\nHobi             : " + String.join(", ", hobi));
    }
}
