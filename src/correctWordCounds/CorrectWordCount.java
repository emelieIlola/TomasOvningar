package correctWordCounds;

import java.util.Scanner;

public class CorrectWordCount {

    // Skapa ett rättstavningsprogram där man
    // tävlar i att skriva ut rätt ord. Användaren
    // får ett ord skrivet på skärmen och skall
    // sedan repetera detta ordet på kommandoraden. Skriver användaren rätt får den
    // 1 poäng annars inget poäng. Repetera detta för några
    // ord (3 ord räcker som exempel) och skriv sen ut totalt
    // antal poäng. När du skapar ditt program försök att lägga
    // logiken samt sparande av data i en class och låt classen
    // med mainmetoden enbart läsa in text och skriva ut resultatet.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Word ord1 = new Word("Äggsmörgås");
        Word ord2 = new Word("nationalencyklopedin");
        Word ord3 = new Word("Halloween");


        System.out.println("Det här är ett rättstavningsprogram. Stavar du rätt får du en poäng");
        System.out.println(ord1.getWord());
        System.out.print("Ditt svar: ");
        String userInput = scan.nextLine();

        int points = 0;
        if (ord1.isCorrectSpelled(userInput)) {
            points++;
            System.out.println("Rättstavat. En poäng till dig.");
        } else {
            System.out.println("Felstavat");
        }
        System.out.println();
        System.out.println("Nästa ord är: ");

        System.out.println(ord2.getWord());
        System.out.print("Ditt svar: ");
        userInput = scan.nextLine();

        if (ord2.isCorrectSpelled((userInput))) {
            points++;
            System.out.println("Rättstavat. En poäng till dig.");
        } else {
            System.out.println("Felstavat");
        }

        System.out.println();
        System.out.println("Nästa ord är: ");
        System.out.println(ord3.getWord());
        System.out.print("Ditt svar: ");

        userInput = scan.nextLine();
        if (ord3.isCorrectSpelled((userInput))) {
            points++;
            System.out.println("Rättstavat. En poäng till dig.");
        } else {
            System.out.println("Felstavat");
        }

        System.out.println("Du fick " + points + " poäng.");

    }
}
