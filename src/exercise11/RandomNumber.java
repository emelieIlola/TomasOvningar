package exercise11;

public class RandomNumber {

    public static void main(String[] args) {

        // define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;


        // generate random numbers from min to max
        // int rand = (int) (Math.random() * range) + min;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min; // att (int) står i parantes är för att förtyliga att det som kommer efter ska skrivas som en int (fast det i detta fal kanske skulle ha bliit en double.
            System.out.println(rand);
        }
    }
}