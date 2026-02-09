public class Gacha {
    public static void main(String[] args) {
        double rand = (double) (Math.random() * 10);

        System.out.printf("Congrats! You got: %.3f \n", rand);

        if (rand >= 5){
            System.out.println("Anda menang asopdjasoiasjdo!");
        }

        else if (Math.round(rand) == 5){
            System.out.println("asdas.");
        }

        else{
            System.out.println("asdasdiasidasd?!.");
        }
    }
}
