package ovningVecka3;

public class DogMain {

    public static void main(String[] args) {

        Dog mydog = new Dog("Bosse", "golden retriver", 4);

        mydog.Bark();
        mydog.GrowAge(2);
        System.out.println(mydog.age);
        mydog.getHumanAge(mydog.age);


    }
}
