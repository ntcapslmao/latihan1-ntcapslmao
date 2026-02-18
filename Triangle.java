import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai = input.nextInt();

        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < nilai-i; j++) {
                System.out.print(nilai - j + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
