public class pertemuan_5 {
    static void main(String[] args) {
        System.out.println("PERULANGAN DENGAN FOR");
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        System.out.println("\nPERULANGAN DENGAN WHILE");
        int K = 0;
        while (K < 5) {
            System.out.println("Perulangan ke-" + K);
            K++;
        }
        System.out.println("\nPERULANGAN DENGAN DO WHILE");
        int j = 0;
        do {
            System.out.println("Perulangan ke-" + j);
            j++;
        } while (j < 5);

    }
}
