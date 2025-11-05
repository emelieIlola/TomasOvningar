package småUpgiffterIJava;

import java.util.Scanner;

public class ScannerUppgift46 {
    //46.Skapa ett program som läser in och adderar tjugo heltal. Summan ska skrivas ut.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ange ett heltal:");
        int tal = scan.nextInt();
       /* int tal1 = scan.nextInt();
        int tal2 = scan.nextInt();
        int tal3 = scan.nextInt();
        int tal4 = scan.nextInt();
        int tal5 = scan.nextInt();
        int tal6 = scan.nextInt();
        int tal7 = scan.nextInt();
        int tal8 = scan.nextInt();
        int tal9 = scan.nextInt();
        int tal10 = scan.nextInt();
        int tal11 = scan.nextInt();
        int tal12 = scan.nextInt();*/
        int summa = 0;

        System.out.println(tal);  //+ tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10 + tal11 + tal12);

        for (int i =0; i<20; i++){
            summa += tal;
            tal+= 1;
            System.out.println("efter " + i + " är summan " + summa); // vi får summan av 20 st efterföljande heltal

        }

    }
}
