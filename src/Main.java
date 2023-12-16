import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nKALKULATOR");
        System.out.println("=========================");
        System.out.println("1. Pertambahan ( + )");
        System.out.println("2. Pengurangan ( - )");
        System.out.println("3. Perkalian ( * )");
        System.out.println("4. Pembagian ( / )");

        System.out.print("\nPilih operasi (1, 2, 3, 4): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

    }
}