package småUpgiffterIJava;

import java.util.Scanner;

public class ScannerUppgift56 {
    //56.Skapa ett program som låter användaren bestämma hur många tal han vill läsa in.
    //Det största och minsta värdet av talen ska beräknas och skrivas ut.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många tal vill du mata in?");
        int antalTal = scan.nextInt();

        if (antalTal == 0) {
            System.out.println("Du måste skriva minst ett tal");
            return;
        }
        System.out.println("Skriv ut första talet");
        int tal = scan.nextInt();
        int max = tal;  //högsta talet
        int min = tal;  //lägsta talet


        for (int i = 2; i <= antalTal; i++) {
            System.out.println("Skriv ut tal " + i);
            tal = scan.nextInt();
            if (tal > max) {
                max = tal;
            } else if (tal < min) {
                min = tal;
            }
        }
        System.out.println("Största talet är: " + max + " och minsta talet är: " + min);
    }
}
