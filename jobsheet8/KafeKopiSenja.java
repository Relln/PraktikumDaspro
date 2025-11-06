package jobsheet8;

import java.util.Scanner;

public class KafeKopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        int slrhPel = 0;
        int slrhItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan : ");
            int pelanggan = sc.nextInt();
            slrhPel += pelanggan;

            int totItem = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totItem += item;

            }
            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totItem);
            slrhItem += totItem;

        }
        System.out.println("Total Seluruh Cabang: ");
        System.out.println("Pelanggan: " + slrhPel + " orang");
        System.out.println("Item terjual: " + slrhItem + " item");

    }
}
