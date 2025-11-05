package exercise2;

import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {


//Använd en switch för att skriva ut långa ord. När man läser in bokstaven a skriver programmet ut t.ex. acetylsalicylsyra. Enligt följande lista:

//A = acetylsalicylsyra
//B = barnavårdscentralen
        //C = citronsyracykeln
//D = djungeltelegrafen

        Scanner scan = new Scanner(System.in);

        String letter = scan.nextLine();

        switch (letter) {
            case "A":
            System.out.println("acetylsalicylsyra");
            break;
            case "B":
            System.out.println("barnavårdscentralen");
            break;
            case "C":
            System.out.println("citronsyracykeln");
            break;
            case "D":
            System.out.println("djungeltelegrafen");
            default:
                System.out.println("Felaktig boktav");

        }

    }

}
