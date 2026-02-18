import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int)(Math.random()*20) + 1;
        int tebakan = 0;
        while (true) {
            System.out.print("Tebak: ");
            tebakan = input.nextInt();

            if (tebakan == target) {
                System.out.println("BOOM! Anda benar");
                break;
            }
            else if (tebakan > target) {System.out.println("Terlalu besar");}
            else if (tebakan < target) {System.out.println("Terlalu kecil");}
        }

        input.close();
    }
}
