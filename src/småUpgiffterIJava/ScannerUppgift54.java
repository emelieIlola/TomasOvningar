package småUpgiffterIJava;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ScannerUppgift54 {
    /* 54.En bilägare har för ett antal tankningar skrivit upp antal tankade liter bensin och antal
    körda mil. Skapa ett program som läser in hur många liter som har tankats samt antal
    körda mil för varje tankningstillfälle. Inmatningen ska avslutas med 0. Algoritmen ska
    beräkna och visa bensinförbrukning per mil för varje tankning. När data för samtliga
    tanktillfällen är inlästa ska genomsnittlig bensinförbrukning per mil skrivas ut.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totallLiterBensin = 0 ;
        double totalKordaMil = 0;

        for (int i = 0; i<10; i++) {
            System.out.println("Dags att tanka. Mata in: antal tankade liter och antal körda mil");
            int literBensin = scan.nextInt();
            int kordaMil = scan.nextInt();
            totallLiterBensin += literBensin;
            totalKordaMil += kordaMil;
            double bensinforbruknig = totallLiterBensin/totalKordaMil;
                if (literBensin ==0) {
                    System.out.println("Programet avslutas. Bensinförbrukninger är: " + bensinforbruknig );
                    System.exit(0);
                } else {
                    //double bensinforbruknig = totallLiterBensin/totalKordaMil;
                    System.out.println("Total liter bensin är: " + totallLiterBensin + " och total antal körda mil är: " + totalKordaMil);
                    System.out.println("bensinförbrukningen är: " + bensinforbruknig);
                }
        }
        System.out.println("bensinförbrukningen på bilen är: " + totallLiterBensin/totalKordaMil);



    }


}
