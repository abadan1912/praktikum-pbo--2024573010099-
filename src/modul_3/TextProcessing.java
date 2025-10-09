package modul_3;

import java.util.*;

public class TextProcessing {

    static void prosesDataMahasiswa(String dataCsv) {
        String[] raw = dataCsv.split(",");
        List<String> nama = new ArrayList<>();
        for (String r : raw) {
            String t = r.trim();
            if (!t.isEmpty()) nama.add(t);
        }

        if (nama.isEmpty()) {
            System.out.println("Tidak ada data.");
            return;
        }

        String terpanjang = nama.get(0), terpendek = nama.get(0);
        for (String n : nama) {
            if (n.length() > terpanjang.length()) terpanjang = n;
            if (n.length() < terpendek.length())  terpendek = n;
        }

        List<String> urut = new ArrayList<>(nama);
        urut.sort(String::compareToIgnoreCase);

        System.out.println("Daftar nama (input): " + nama);
        System.out.println("Nama terpanjang     : " + terpanjang);
        System.out.println("Nama terpendek      : " + terpendek);
        System.out.println("Diurutkan (A-Z)     : " + urut);
    }

    static String formatTitleCase(String s) {
        String[] parts = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p.isEmpty()) continue;
            sb.append(Character.toUpperCase(p.charAt(0)))
                    .append(p.substring(1))
                    .append(" ");
        }
        return sb.toString().trim();
    }

    static String formatKataInitial(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (!p.isEmpty()) sb.append(Character.toUpperCase(p.charAt(0))).append('.');
        }
        return sb.toString();
    }

    static String buatUsername(String namaLengkap) {
        // username: namaDepan + namaBelakang (lowercase), hanya huruf
        String bersih = namaLengkap.toLowerCase().replaceAll("[^a-z\\s]", "").trim();
        String[] p = bersih.split("\\s+");
        if (p.length == 0) return "user";
        String depan = p[0];
        String belakang = p.length > 1 ? p[p.length - 1] : "";
        return (depan + belakang).replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input massal
        System.out.print("Masukkan data nama (pisahkan dengan koma): ");
        String dataCsv = sc.nextLine();
        prosesDataMahasiswa(dataCsv);

        // Input satu nama untuk format
        System.out.print("Masukkan satu nama lengkap: ");
        String nama = sc.nextLine();

        System.out.println("Title Case  : " + formatTitleCase(nama));
        System.out.println("Inisial     : " + formatKataInitial(nama));
        System.out.println("Username    : " + buatUsername(nama));

        sc.close();
    }
}
