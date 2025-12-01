package jobsheet11;

public class PengunjungCafe10 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Dafter Nama Pengungjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        
    }
}
