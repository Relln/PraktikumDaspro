package jobsheet9;

import java.util.Scanner;

public class MenuTersediaKafe10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
    "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
    
    System.out.println("========================");
    System.out.println("Menu yang tersedia");
    System.out.println("========================");
    for (String item : menu) {
        System.out.println("- " + item);
    }

    System.out.print("Masukkan Nama makanan/minuman yang ingin dicari: ");
    String key = sc.nextLine();

    boolean ditemukan = false;
    int indeksditmkn = -1;

    for (int i = 0; i < menu.length; i++) {
        if (key.equalsIgnoreCase(menu[i])) {
            ditemukan = true;
            indeksditmkn = i;
            break;
        }
    }

    if (ditemukan) {
        System.out.println("Makanan/Minuman "+ key + "  tersedia di menu! ");
        System.out.println("Ditemukan pada urutan ke-"+ (indeksditmkn + 1) + " (Indeks ke-"+ indeksditmkn + ")");
    } else {
        System.out.println("Maaf, Makanan/Minuman "+ key + " tidak tersedia di menu");
    }


    }
}
