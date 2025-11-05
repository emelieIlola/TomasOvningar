package exercise11;


public class RandomArray {

    public static void main(String[] args) {
        //Spara 10 slumptal 1-100 i en array.
        int[] randomArray = new int[10];
        // define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;


        //Spara 10 slumptal 1-100 i en array.
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
            randomArray[i] = rand;
        }
        System.out.println();

        // skriv ut innehållet i arrayen i consolen.

        for (int i = 0; i < randomArray.length; i++) {
         //   System.out.println("på index " + i + " finns int = " + randomArray[i]);
        }

// skapa en metod som returnerar slumptal från 1-100 i en array.


        RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("på index " + i + " finns int = " + newArray[i]);
        }

    //Storleken på arrayn är också slumptal ifrån 1-100.

    }
}


