package exercise11;

public class RandomGenerator {

    public int[] randomArray() {
        //Spara 10 slumptal 1-100 i en array.

        // define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        int arrayLength = (int) (Math.random() * range) + min;
        int[] randomArray = new int[arrayLength];
        //Spara 10 slumptal 1-100 i en array.
        for (int i = 0; i < randomArray.length; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;
        }
        return randomArray;

    }
}
