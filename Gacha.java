public class Gacha {
    public static void main(String[] args) {
        double rand = (double) (Math.random() * 10);

        System.out.printf("Congrats! You got: %.3f \n", rand);

        if (rand >= 5){
            System.out.println("You won a Mercedes AMG W11, used by Sir Lewis Hamilton himself!");
        }

        else if (Math.round(rand) == 5){
            System.out.println("You won a McLaren MCL39, used by Lando Norris.");
        }

        else{
            System.out.println("You won a Ferrari SF-25, the P6 and P7 finishers used by... Sir Lewis Hamilton?!.");
        }
    }
}
