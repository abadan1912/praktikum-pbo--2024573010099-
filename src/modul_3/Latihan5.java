package modul_3;

import java.util.Scanner;

public class Latihan5 {
    static int hitungVokal(String s) {
        int c = 0;
        for (char ch : s.toLowerCase().toCharArray()) if ("aiueo".indexOf(ch) >= 0) c++;
        return c;
    }

    static int jumlahKata(String s) {
        String t = s.trim();
        if (t.isEmpty()) return 0;
        return t.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String s = sc.nextLine();

        System.out.println("Vokal        : " + hitungVokal(s));
        System.out.println("Uppercase    : " + s.toUpperCase());
        System.out.println("Lowercase    : " + s.toLowerCase());
        System.out.println("Jumlah kata  : " + jumlahKata(s));

        sc.close();
    }
}

