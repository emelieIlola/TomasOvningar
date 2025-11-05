package småUpgiffterIJava;

public class Uppgift11 {

//11.Skapa ett program där två tal sparas i variabler och det första talet skrivs ut om det är
  //  störst.

    public static void main(String[] args) {

        int tal1 = skapaTal1();
        int tal2 = 23;
        utskrift(tal1, tal2);

      //  if (tal1>tal2) System.out.println(tal1 + " tal1 är större än tal2");

    }

    static int skapaTal1(){
        return 50;
    }

    static void utskrift (int a, int b) {
        if (a>b) System.out.println(a + " tal1 är större än tal2");
    }
}
