package jobsheet9;

import java.util.Scanner;

public class PengelolaanMahasiswa10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nilaiTertinggi, nilaiTerrendah;
    int totalNilai = 0;
    double rata2;

    System.out.print("Masukkan jumlah mahasiswa : ");
    int mhs = sc.nextInt();
    
    int[] nilaiMhs = new int[mhs];

    for (int i = 0; i < mhs; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) +" (Bilangan bulat) : ");
        nilaiMhs[i] = sc.nextInt();
        totalNilai += nilaiMhs[1];
    }

    nilaiTertinggi = nilaiMhs[0];
    nilaiTerrendah = nilaiMhs[0];

    for (int i = 0; i < mhs; i++) {
        if (nilaiMhs[i] > nilaiTertinggi) {
            nilaiTertinggi = nilaiMhs[i];
        }
        if (nilaiMhs[i] < nilaiTerrendah) {
            nilaiTerrendah = nilaiMhs[i];
        }
    }

    rata2 = totalNilai / mhs;

    System.out.print("Semua Nilai Mahasiswa: [");  
    for (int i = 0; i < mhs; i++) {
        System.out.print(nilaiMhs[i]);        
        if (i < mhs - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");


    System.out.printf("Nilai Rata-Rata: %.2f\n", rata2);
    System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
    System.out.println("Nilai Terendah: " + nilaiTerrendah);



    }
}
