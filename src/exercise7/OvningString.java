package exercise7;

import java.util.Scanner;

public class OvningString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett valfritt ord:");
        String text = scan.nextLine();
        System.out.println("Valfritt ord är " + text);

        if (text.equals("ägg")){
            System.out.println("ägg är knasigt");
        } else {
            for (int i = 0; i < text.length(); i++) {
                //char bokstav = text.charAt(i);
                //System.out.println(bokstav);
                System.out.print(text.charAt(i) + " ");
            }
        }

    }
}
/*Läs in en String (scan.nextLine())
Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut
*/