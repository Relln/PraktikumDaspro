package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe10 {
    
    public static void DataPenjualan(Scanner sc, int[][] dataJual, int jmlMenu, int jmlHari) {
        sc.nextLine();

        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Input Penjualan Menu ke-" + (i + 1));
                for (int j = 0; j < jmlHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataJual[i][j] = sc.nextInt();
            }
        }     
    }

    public static void TampilData(int[][] dataJual, int jmlMenu) {
        int JML_HARI = dataJual[0].length;
        System.out.println("\n--- Rekap Penjualan ---");
        
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= JML_HARI; h++) {
            System.out.printf("|  HARI %-3d", h);
        }
        System.out.println();
        for (int i = 0; i < jmlMenu; i++) { 
            System.out.printf("%-15s", "Menu " + (i + 1)); 
            for (int j = 0; j < JML_HARI; j++) {
                System.out.printf("| %-9d", dataJual[i][j]);
            }
            System.out.println();
        }
    }
    public static void PenjualanTertinggi(int[][] dataJual, int jmlMenu) {
        int MenuTertinggi = 0;
        int TotPenjualan = -1;
        
        for (int i = 0; i < dataJual.length; i++) {
            int totalSaatIni = 0;
            for (int j = 0; j < dataJual[i].length; j++) {
                totalSaatIni += dataJual[i][j];
            }

            if (totalSaatIni > TotPenjualan) {
                TotPenjualan = totalSaatIni;
                MenuTertinggi = i;
            }
        }
        System.out.println("Menu Tertinggi adalah Menu " + (MenuTertinggi + 1)); 
        System.out.println("Total Penjualan adalah " + TotPenjualan + " item");
    }
    public static void RataRata(int[][] dataJual, int jmlMenu) {
        int JML_HARI = dataJual[0].length;
        System.out.println("\n--- Rata-rata Penjualan ---");

        for (int i = 0; i < dataJual.length; i++) {
            double total = 0;
            for (int j = 0; j < JML_HARI; j++) {
                total += dataJual[i][j];
            }
            double rataRata = total / JML_HARI;
            
        String namaMenu = "Menu " + (i + 1);
        System.out.printf(namaMenu + " : %.2f unit\n", rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();

        int[][] dataPenjualan = new int[jmlMenu][jmlHari];

        DataPenjualan(sc, dataPenjualan , jmlMenu, jmlHari);
        TampilData(dataPenjualan, jmlMenu);
        PenjualanTertinggi(dataPenjualan, jmlMenu);
        RataRata(dataPenjualan, jmlMenu);





    }




}
