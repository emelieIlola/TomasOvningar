package småUpgiffterIJava;

public class UppgiftIfOvning {


public static void Kontroll(int a) {

    if (a<10) {
        System.out.println("talet är mindre än 10");
    } else if (a<100) {
        System.out.println("talet är mindre än 100");
    } else {
        System.out.println("talet är större än 100");
    }
}

    public static void main(String[] args) {
        int talet = 200;
        Kontroll(talet);


    }

}
//30. Spara ett tal. Skriv ut om talet är mindre än 10, mindre än 100 eller större än 100.