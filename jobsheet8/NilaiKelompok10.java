package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, tinggi = 0;
        float rataNilai, totalNilai, terTinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }   

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": Nilai Rata-rata = " + rataNilai);

            if (rataNilai > terTinggi) {
                terTinggi = rataNilai;
                tinggi = i;
            }

            i++;
        
        }
        
        System.out.println("Kelompok dengan rata-rata Nilai tertinggi : " + terTinggi);
        System.out.println("Nomor Kelompok dengan rata-rata tertinggi : " + tinggi);






    }
}
