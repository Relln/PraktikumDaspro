package jobsheet8;

import java.util.Scanner;

public class JumlahKuadrat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int nilai = sc.nextInt();

        for (int n = 1; n <= nilai; n++) {
            int jmlKuadrat = 0;
            String deretKuadrat = "";

            for (int i = 1; i <= n; i++) {
                int kuadrat = 0;
                for (int j = 1; j <= i; j++) {
                    kuadrat += i;
                }
                jmlKuadrat += kuadrat;
                
                if (!deretKuadrat.isEmpty()) {
                    deretKuadrat += " + ";
                }
                deretKuadrat += kuadrat;
            }
            System.out.println("n = " + n + " -> jumlah kuadrat = " + deretKuadrat + " = " + jmlKuadrat);
        }



    }
}
