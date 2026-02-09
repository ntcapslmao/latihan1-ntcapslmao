public class Gacha {
    public static void main(String[] args) {
        double rand = (double) (Math.random() * 10);

        System.out.printf("Congrats! You got: %.3f \n", rand);

        if (rand >= 0 && rand <= 6) {
            System.out.println("You won a brand new Volkswagen Golf!");
        }

        else if (rand > 6 && rand <= 9) {
            System.out.println("You won a brand new McLaren 720S!");
        }

        else if (rand > 9) {
            System.out.println("You won a used Mercedes-AMG W11, the championship winning car from the 2020 FIA Formula One World Championship, driven by Sir Lewis Hamilton himself!");
        }
    }
}
