package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS10 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    //verifikasi pembayaran ukt
    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    String total = (uktLunas) ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak";
    System.out.print(total);
   
    
        }
            }
