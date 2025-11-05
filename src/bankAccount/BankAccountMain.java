package bankAccount;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(0);
        //System.out.println("Mitt saldo är: " + myAccount.getSaldo());
        System.out.print("Hur mycket har du på kontot? ");
        Scanner scan = new Scanner(System.in);

        myAccount.setSaldo(scan.nextInt());
        System.out.println(myAccount.getSaldo());
        int svar = 0;

        while (svar != 3) {
            System.out.println("För insättning tryck 1, För uttag tryck 2, För att avsluta tryck 3");
            svar = scan.nextInt();
            if (svar == 1) {
                System.out.println("Hur mycket vill du sätta in?");
                svar = scan.nextInt();
                myAccount.insert(svar);
                System.out.println("Aktuellt saldo är: " + myAccount.getSaldo());
                System.out.println();
            } else if (svar == 2) {
                System.out.println("Hur mycket vill du ta ut?");
                svar = scan.nextInt();
                myAccount.withdraw(svar);
                if (myAccount.withdraw(svar)){
                    System.out.println("Aktuellt saldo är: " + myAccount.getSaldo());
                } else if(!myAccount.withdraw(svar)) {
                    System.out.println("Saldot är ej tillräckligt. Aktuellt saldo är "+ myAccount.getSaldo() );
                }
               // System.out.println("Aktuellt saldo är: " + myAccount.getSaldo());
                System.out.println();
            } else if (svar == 3) {
                System.out.println("Avslutar");
            }
        }
/*
        myAccount.insert(200);
        System.out.println("Mitt nya saldo efter insättningen är " + myAccount.getSaldo());
        myAccount.withdraw(700);
        System.out.println("Mitt nya saldo efter insättningen är " + myAccount.getSaldo());
        myAccount.setSaldo((20000));
        System.out.println(myAccount.getSaldo());
        if (myAccount.withdraw(700)) {
            System.out.println("Mitt nya saldo efter uttaget är: " + myAccount.getSaldo());
        }
        if (!myAccount.withdraw(30000)) {
            System.out.println("så mycket pengar har jag inte. Mitt belopp är: " + myAccount.getSaldo());
        }
 */


    }
}
