public class Gacha {
    public static void main(String[] args) {
        double rand = (double) (Math.random() * 10);

        System.out.printf("Congrats! You got: %.3f \n", rand);

        if (rand >= 5){
            System.out.println("Anda menang Mercedes A-Class");
        }

        else if (Math.round(rand) == 5){
            System.out.println("Anda menang Mercedes AMG W11");
        }

        else{
            System.out.println("Anda menang Mercedes TransJakarta");
        }
    }
}
