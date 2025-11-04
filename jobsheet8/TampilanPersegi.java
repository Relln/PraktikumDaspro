package jobsheet8;

import java.util.Scanner;

public class TampilanPersegi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai n : ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n minimal harus 3 ");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {     
                if ( i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }








    }
}
