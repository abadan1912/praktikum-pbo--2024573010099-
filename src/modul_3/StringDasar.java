package modul_3;

import java.util.Scanner;

public class StringDasar {

    static void analysisString(String s) {
        String trimmed = s.trim();
        int panjang = trimmed.length();
        String[] kata = trimmed.isEmpty() ? new String[0] : trimmed.split("\\s+");
        System.out.println("Panjang karakter : " + panjang);
        System.out.println("Jumlah kata      : " + kata.length);
        System.out.println("Uppercase        : " + trimmed.toUpperCase());
        System.out.println("Lowercase        : " + trimmed.toLowerCase());
    }

    static int hitungVokal(String s) {
        int cnt = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aiueo".indexOf(c) >= 0) cnt++;
        }
        return cnt;
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        String bersih = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return bersih.equals(reverseString(bersih));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String input = sc.nextLine();

        System.out.println("--- Analisis ---");
        analysisString(input);
        System.out.println("Jumlah vokal     : " + hitungVokal(input));
        System.out.println("Reverse          : " + reverseString(input));
        System.out.println("Palindrome?      : " + (isPalindrome(input) ? "Ya" : "Tidak"));

        sc.close();
    }
}
