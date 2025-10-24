package jobsheet7;

import java.util.Scanner;

public class ParkirKendaraan10 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int durasi, totalTarif;
int mobil = 2, motor = 1, keluar = 0;
int kendaraan, tarif;

do {
    System.out.print("Masukkan Jenis kendaraan : ");
    kendaraan = sc.nextInt();

    if (kendaraan == 2){
        tarif = 3000;
    } else if (kendaraan == 1) {
        tarif = 2000;
    } else {
        System.out.println("Kendaraan tidak valid, Silahkan Masukkan Kendaraan yang valid!");
        continue;
    } 

    System.out.print("Berapa lama parkir(dalam jam) : ");
    durasi = sc.nextInt();

    totalTarif = tarif*durasi;

    if (durasi > 5) {
        totalTarif += 12500;
    } else if (durasi <= 0) {
        System.out.println("Tarif Dibatalkan");
        break;
    }
    System.out.println("Tarif Parkir yang harus dibayar : " + totalTarif);
}
while(true);

System.out.println("Terimakasih Silahkan Datang Kembali");
  }
}
