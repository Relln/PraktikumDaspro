package jobsheet11;

public class Kubus10 {
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6*sisi^2;
    }

    public static void main(String[] args) {
        int panjangSisi = 6;

        System.out.println("Panjang sisi: "+ panjangSisi);

        int volume = hitungVolume(panjangSisi);
        System.out.println("Volume kubus: "+ volume);

        int luasPermukaan = hitungLuasPermukaan(panjangSisi);
        System.out.println("Luas Permukaan kubus: "+ luasPermukaan);

    }
}
