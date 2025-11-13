package jobsheet9;

import java.util.Scanner;

public class MakananKafe10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah pesanan: ");
    int pesanan = sc.nextInt();

    sc.nextLine();

    String[] namaPesanan = new String[pesanan];
    double[] hargaPesanan = new double[pesanan];
    double totalBiaya = 0;

    for (int i = 0; i < pesanan; i++) { 
        System.out.println("Pesanan ke-"+ (i + 1) +": ");

        System.out.print("Nama makanan/minuman: ");
        namaPesanan[i] = sc.nextLine();

        System.out.print("Harga pesanan (Rp): ");
        hargaPesanan[i] = sc.nextDouble();
        sc.nextLine();

        totalBiaya += hargaPesanan[i];
        System.out.println();
    }

    System.out.println("Daftar Pesanan Anda adalah");
    System.out.println("================================================");
    System.out.printf("%-5s | %-25s | %-10s\n", "No.", "Nama Pesanan", "Harga (Rp)");

    for (int i = 0; i < pesanan; i++) {
        System.out.printf("%-5d | %-25s | Rp %.2f\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
    }

    System.out.println("================================================");
    System.out.printf("Total Biaya Keseluruhan: Rp %.2f\n", totalBiaya);

    }
}