import java.util.Scanner;

public class NilaiSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir: ");
        double nilai = input.nextDouble();
        String grade;

        if (nilai >= 85 && nilai <= 100)
            grade = "A";
        else if (nilai >= 80 && nilai < 85)
            grade = "A-";
        else if (nilai >= 75 && nilai < 80)
            grade = "B+";
        else if (nilai >= 70 && nilai < 75)
            grade = "B";
        else if (nilai >= 65 && nilai < 70)
            grade = "B-";
        else if (nilai >= 60 && nilai < 65)
            grade = "C+";
        else if (nilai >= 55 && nilai < 60)
            grade = "C";
        else if (nilai >= 0 && nilai < 55) 
            grade = "E";
        else grade = "NILAI INVALID";

        System.out.printf("Dengan nilai akhir %.2f (dibulatkan), anda mendapat grade %s.", nilai, grade);
        input.close();
    }
}
