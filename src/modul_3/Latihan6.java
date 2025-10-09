package modul_3;

import java.util.Scanner;

public class Latihan6 {

    static boolean namaValid(String nama) {
        // Hanya huruf, spasi, dan tanda hubung
        return nama.matches("[A-Za-zÀ-ÿ\\s\\-]+");
    }

    static String buatEmail(String namaLengkap, String domain) {
        // email: firstname.lastname@domain (lowercase), hilangkan non-huruf
        String clean = namaLengkap.toLowerCase().replaceAll("[^a-z\\s]", "").trim();
        String[] parts = clean.split("\\s+");
        String first = parts.length > 0 ? parts[0] : "user";
        String last  = parts.length > 1 ? parts[parts.length - 1] : "guest";
        return first + "." + last + "@" + domain.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = sc.nextLine();

        if (!namaValid(nama)) {
            System.out.println("Format nama TIDAK valid (tidak boleh mengandung angka/karakter khusus).");
            sc.close();
            return;
        }

        System.out.print("Masukkan domain email (contoh: kampus.ac.id): ");
        String domain = sc.nextLine().trim();

        if (domain.isEmpty()) domain = "example.com";
        String email = buatEmail(nama, domain);
        System.out.println("Email yang dihasilkan: " + email);

        sc.close();
    }
}

