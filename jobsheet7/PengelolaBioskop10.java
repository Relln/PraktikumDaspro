package jobsheet7;

import java.util.Scanner;

public class PengelolaBioskop10{
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

String cancel;
int jmlPelanggan, tiket, hargaTiket = 50000, i = 1;
int totalTiket = 0;
double diskon = 0, totalhargaTiket = 0;

System.out.print("Masukkan Jumlah Pelanggan hari ini : ");
jmlPelanggan = sc.nextInt();

do {
    System.out.print("Masukkan Jumlah tiket yang dibeli pelanggan ke- " + i + " : ");
    tiket = sc.nextInt();
    if (tiket <= 0) {
    System.out.println("Jumlah tiket tidak valid. Silahkan input ulang!");
    continue;
    } else if (tiket > 0 && tiket <= 4) {
        diskon = 0;
        totalTiket += tiket;
    } else if (tiket > 4 && tiket <= 10) {
        diskon = 0.1;
        totalTiket += tiket;
    } else if (tiket > 10 && tiket <= 100) {
        diskon = 0.15;
        totalTiket += tiket;
    } else {
        System.out.println("Input Tidak Valid. Silahkan input ulang!");
    }
    i++;
    totalhargaTiket = ((hargaTiket*tiket) - ((hargaTiket*tiket)*diskon));
} while (i <= jmlPelanggan);
    
System.out.println("Total tiket yang terjual :" + totalTiket);
System.out.println("Total harga tiket yang terjual : " + totalhargaTiket);

  }
}