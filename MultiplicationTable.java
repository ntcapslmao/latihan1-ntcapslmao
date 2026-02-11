public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("TABEL PERKALIAN %d\n", i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
                if (j == 10) System.out.println();
            }
        }
    }
}