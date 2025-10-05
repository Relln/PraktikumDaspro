package jobsheet5;

import java.util.Scanner;

public class IzinMasukPerpus10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean ktm, regOnline;

    System.out.println("Apakah anda punya ktm? (true/false)");
    ktm = sc.nextBoolean();
    
    System.out.println("Apakah anda sudah registrasi online? (true/false)");
    regOnline = sc.nextBoolean();

    if (ktm || regOnline == true) {
        System.out.println("Anda boleh masuk");
    } else {
        System.out.println("Anda tidak boleh masuk");
    }








    }
}


