import java.util.Scanner;

public class RookieYear{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Nama      : ");
        String nama = input.nextLine();
        System.out.print("Angkatan  : ");
        int angkatan = input.nextInt();

        System.out.println("Halo, " + nama + " dari angkatan " + angkatan);
    }
}