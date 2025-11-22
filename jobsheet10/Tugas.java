package jobsheet10;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PENGUMPULAN DATA SURVEI ===");
        System.out.print("Masukkan Jumlah Responden: ");
        int jumlahResponden = sc.nextInt();

        System.out.print("Masukkan Jumlah Pertanyaan: ");
        int jumlahPertanyaan = sc.nextInt();

        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];
        double totalKeseluruhan = 0;

        System.out.println("\n--- INPUT DATA SURVEI ---");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                int nilaiInput;
                do {
                    System.out.printf("  Nilai P%d (1-5): ", (j + 1));
                    nilaiInput = sc.nextInt();
                    if (nilaiInput < 1 || nilaiInput > 5) {
                        System.out.println("Nilai harus antara 1 sampai 5. Ulangi.");
                    }
                } while (nilaiInput < 1 || nilaiInput > 5);

                hasilSurvei[i][j] = nilaiInput;
            }
        }

        System.out.println("\n[Rata-Rata Berdasarkan Responden]");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            double rataRataResponden = totalResponden / jumlahPertanyaan;
            totalKeseluruhan += totalResponden;

            System.out.printf("Responden %-2d: %.2f\n", (i + 1), rataRataResponden);
        }

        System.out.println("\n[Rata-Rata Berdasarkan Pertanyaan]");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                    totalPertanyaan += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / jumlahResponden;

            System.out.printf("Pertanyaan %d: %.2f\n", (j + 1), rataRataPertanyaan);
        }

        int totalData = jumlahResponden * jumlahPertanyaan;
        double rataRataKeseluruhan = totalKeseluruhan / totalData;
        System.out.printf("Rata-Rata Nilai Keseluruhan: %.2f\n", rataRataKeseluruhan);





        }
    }
