public class LoopingShit {
    public static void main(String[] args) {
        int a = 10; int b = 0;
        while (a < 10) {
            b += a;
            if (a % 2 == 0) {a /= 2;}
            else {a += 5;}
        }

        System.out.println("a = " + a + " b = " + b);

        int c = 10; int d = 0;
        do {
            d += c;
            if (c % 2 == 0) {c /= 2;}
            else {c += 5;}   
        } while (c < 10);

        System.out.println("c = " + c + " d = " + d);
    }
}