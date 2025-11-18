package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihanMenu, baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            if (sc.hasNextInt()) {
                pilihanMenu = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.nextLine();
                continue;
            }

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi berhasil dipesan!");
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi (" + baris + ", " + kolom + ") sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Kursi berhasil dipesan!");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");

                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaKursi = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.print(namaKursi + " (" + (i + 1) + "," + (j + 1) + ") | ");
                        }
                        System.out.println();
                    }
                    System.out.println("Keterangan: *** = Kursi Kosong");
                    break;

                case 3:
                    System.out.println("\nSampai jumpa!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan menu tidak ada.");

            }
        }

    }
}
