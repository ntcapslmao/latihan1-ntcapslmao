import java.util.Scanner;

public class Worksheet1 {
    public static void main(String[] argv) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuliskan sisi bujur sangkar: ");
        double sisi = scanner.nextDouble();

        double hasil = sisi * sisi;
        System.out.printf("Luas bujur sangkar dengan sisi %.3f adalah %.3f", sisi, hasil);
    }
}