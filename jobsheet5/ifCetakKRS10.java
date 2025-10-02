package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS10 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    //verifikasi pembayaran ukt
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    
    }
    else {
        System.out.println("Registrasi ditolak");
        System.out.println("Silahkan lunasi UKT terlebih dahulu");

    }
        }
            }
