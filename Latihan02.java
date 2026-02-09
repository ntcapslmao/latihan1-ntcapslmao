public class Latihan02 {
    public static void main(String[] args) {
        int a = 17;
        int b = 22;
        int c = 15;
        
        if (a > b)
            if (a > c)
                System.out.println("Nilai terbesar adalah " + a);
            else
                System.out.println("Nilai terbesar adalah " + c);

        else if (b > c)
            System.out.println("Nilai terbesar adalah " + b);
        else
            System.out.println("Nilai terbesar adalah " + c);
    }
}
