import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int bilangan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuliskan sebuah bilangan bulat: ");
        bilangan = scanner.nextInt();

        String data = "";

        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                data = data + String.valueOf(i) + " ";
            }
        }

        System.out.printf("Faktor prima dari %d adalah: %s", bilangan, data);
        scanner.close();
    }
}
