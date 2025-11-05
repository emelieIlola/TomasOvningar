package småUpgiffterIJava;

public class Kvadrat {
    //1. Skapa ett program som skriver ut kvadraten på ett tal som är definierat i en variabel.
    //  Kvadraten är talet multiplicerat med sig själv

    public static void main(String[] args) {

        int tal = 12;
        int kvadraten = tal * tal;
        System.out.println("kvadraten är " + kvadraten);




       /* 10.Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9*C / 5 + 32.
        Skapa ett program där en temperatur i Celsius och motsvarande temperatur i
        Fahrenheit skrivs ut.*/


        int celcius = 5;
        int farenheit = 9 * celcius / 5 + 32;

        System.out.println(celcius + " grader motsvarar " + farenheit + " farenheit");

        System.out.println();

        /*9. Skapa ett program där en cirkels radie är definierad i en variabel. Cirkelns diameter,
        omkrets och area skall beräknas och skrivas ut. (anta att pi = 3.14)*/


        double radie = 1.3;
        double diameter = radie * 2;
        double omkrets = diameter * 3.14;
        double area = radie * radie * 3.14;

        System.out.println("diametern är " + diameter);
        System.out.println("omkretsen är " + omkrets);
        System.out.println("arean är " + area);

        System.out.println();

        /*7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala.
                Indatan kan vara definierade i variabler. */

        int antalLiter = 43;
        double literPris = 18.23;

        double priceToPay = antalLiter * literPris;

        System.out.println("Price to pay is " + priceToPay);

        System.out.println();


        // 5. Definiera ett heltal i en variabel som anger svenska kronor. Skriv ut motsvarande värde
        // i pund respektive dollar. Antag att kursen är: 1 dollar = 6 kr, 1 pund = 10 kr.


        double svenskakronor = 6;
        double dollar = svenskakronor / 6;
        double pund = svenskakronor / 10;

        System.out.println(svenskakronor + " svenska kronor motsvarar " + dollar + " dollar");

        System.out.println(svenskakronor + " svenska kronor motsvarar " + pund + " pund");
    }


}
