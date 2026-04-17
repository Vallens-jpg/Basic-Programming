import java.util.Scanner;

public class pertemuan_4 {
    static void main(String[] args) {
        System.out.println("=== RUMUS BANGUN RUANG ===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");

        int pilihan = 1;
        switch (pilihan) {
            case 1:
                Scanner inputPanjang = new Scanner(System.in);
                Scanner inputLebar = new Scanner(System.in);

                System.out.println("Anda memilih luas Persegi Panjang");
                System.out.println("Masukkan Panjang: ");
                int panjang = inputPanjang.nextInt();
                System.out.println("Masukkan Lebar: ");
                int lebar = inputLebar.nextInt();
                int rumus = panjang * lebar;
                System.out.println("Luas Persegi Panjang adalah: " + rumus);
                break;
            case 2:
                Scanner inputSisi = new Scanner(System.in);

                System.out.println("Anda memilih luas Persegi");
                System.out.println("Masukkan Sisi: ");
                int sisi = inputSisi.nextInt();
                int rumus2 = sisi * sisi;
                System.out.println("Luas Persegi adalah: " + rumus2);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
