import java.util.Scanner;

public class pertemuan_3 {
    static void main(String[] args) {
        int nilai = 60;

        if (nilai >= 60) {
            System.out.println("\nSelamat anda lulus");
        } else if (nilai < 60) {
            System.out.println("Maaf anda tidak lulus");
        } else {
            System.out.println("Nilai tidak valid");
        }
        System.out.println("\n\n=== JENIS IF KEDUA DENGAN INPUT DAN OPERATOR PEMBANDINGAN ===\n\n");

        Scanner MTK = new Scanner(System.in);
        System.out.println("Masukkan nilai MTK: ");
        int nilaiMTK = MTK.nextInt();

        if (nilaiMTK >= 60 && nilaiMTK <= 100) {
            System.out.println("Selamat anda lulus");
        } else if (nilaiMTK < 60 && nilaiMTK >= 0) {
            System.out.println("Maaf anda tidak lulus");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}