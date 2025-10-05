package jobsheet5;

import java.util.Scanner;

public class PengunaanWiFi10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String pengguna;
    int SKS;

    System.out.println("username :");
    pengguna = sc.nextLine();

        if (pengguna.equals ("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (pengguna.equals ("mahasiswa")) {
            System.out.println("Masukkan SKS :");
            SKS = sc.nextInt();
            if (SKS >= 12) {
                System.out.println("Akses WiFi diberikan(mahasiswa aktif)");
            } else { 
                System.out.println("Akses WiFi ditolak, SKS kurang dari 12");  
            }
        } else { 
            System.out.println("Akses WiFi ditolak");
        }
    }
}


