package jobsheet5;
import java.util.Scanner;

public class jobsheet5tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka adalah genap");
        } else {
          System.out.println("Angka adalah ganjil");
        }

    }

}
