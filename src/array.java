public class array {
    static void main(String[] args) {
        System.out.println("ARRAY 1 DIMENSI");
        String[] mahasiswa = {"Budi", "Siti", "Agus", "Rina"};

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa indeks ke-" + i + ": " + mahasiswa[i]);
        }

        System.out.println("\nARRAY 2 DIMENSI");
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }

}
