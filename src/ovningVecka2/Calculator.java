package ovningVecka2;

public class Calculator {
    //attribut
    int tal1, tal2;

    //konstruktor. Definiera inparametrarna. Dessa inparametrar är endast levande i detta kodblock.
    public Calculator(int tal1, int tal2) {
        this.tal1 = tal1;
        this.tal2 = tal2;
    }
    public int addition () {
        int summa = tal1 + tal2;
        return summa;
        //System.out.println("Vid addition " + emeliesSumma);
    }
    public int minus() {
        return tal1-tal2;
        //System.out.println("Vid subtration " + emeliesminus);
    }
    public double delat (){
        return (double) tal1/tal2;
        //System.out.println("Vid division " + emeliesDelat);
    }
    public int multiplikation (){
        return tal1*tal2;
        //System.out.println("Vid multiplicering " + emeliesGanger);
    }

}

/*  Skapa en class Calculator som läser in två tal i
    konstruktorn och sparar dem som attribut.
7.	Skapa en metod som skriver ut addition för	dessa
    två tal. Skapa ett objekt och anropa denna metod ifrån
    en annan klass som har en 	main-metod Pr
8.	Uppdatera din main-metod så att den läser in
    de två talen med Scanner
9.	Uppdatera Calculator så att den har liknande
    metoder för minus/delat med/gånger
 */