package modul_2;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi Anda: ");
        double tinggi = input.nextDouble();


        System.out.println("\n=== DATA ANDA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");


        input.close();
    }
}
