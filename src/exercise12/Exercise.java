package exercise12;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        //Skapa ett program som innehåller en array med fem namn

       // String[] names = {"Emelie", "Elsa", "Agnes", "Patrik", "Esther"};
        String [] names = new String[5];
        names[0] = "Emelie";
        names[1] = "Elsa";
        names[2] = "Agnes";
        names[3] = "Patrik";
        names[4] = "Esther";

        for (int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        //Skriv ut det första och sista namnet
        System.out.println(names[0] + " & " + names[4]);

        String myString = "hej på dig";
        String[] stringArray = myString.split(" ");
        for (int i = 0; i<stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
