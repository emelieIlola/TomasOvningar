package exercise11;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {


        //Skapa en metod som läser in två kateter (a och b) på en triangen och räkar ut hypotenusan.

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett heltal;");
        int kateterA = Integer.parseInt(scan.nextLine());    // skriv inte : scan.nextline(), då det kan leda till mindre problem.
        System.out.println("Skriv ett till heltal; ");
        int kateterB = Integer.parseInt(scan.nextLine());

        double hypotenusa = Math.sqrt(kateterA*kateterA+kateterB*kateterB);

        System.out.println("Hypotenusans längd är " + hypotenusa);
    }
}
