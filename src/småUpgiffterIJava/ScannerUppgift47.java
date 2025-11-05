package småUpgiffterIJava;

import java.util.Scanner;

public class ScannerUppgift47 {

    //49.Skapa ett program som läser in 100 tal och beräknar och skriver ut summan av de positiva talen.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tal = scan.nextInt();
        //System.out.println(tal);
        int summa = 0;

        for (int i = 0; i<100; i++){
            if (tal%2 == 0 ){
                summa += tal;
                tal += 2;
            } else
                tal+=1;
        }
        System.out.println(summa);

    }
}
