import java.util.Scanner;

public class Coordinates2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan koordinat: ");

        String teksInput = input.nextLine();
        String kuadran;

        int comma = teksInput.indexOf(',');
        int space = teksInput.indexOf(' ');

        String x_coordString = teksInput.substring(1, comma);
        String y_coordString = teksInput.substring(space+1, teksInput.length()-1);

        int x_coords = Integer.parseInt(x_coordString);
        int y_coords = Integer.parseInt(y_coordString);

        if (x_coords > 0) {
            if (y_coords > 0) {
                kuadran = "Kuadran I";
            }
            else {kuadran = "Kuadran IV";}
        }
        else {
            if (y_coords > 0) {
                kuadran = "Kuadran II";
            }
            else {kuadran = "Kuadran III";}
        }

        System.out.printf("Koordinat %s berada di %s.", teksInput, kuadran);
        input.close();
    }
}
