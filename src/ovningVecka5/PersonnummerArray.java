package ovningVecka5;


public class PersonnummerArray {
//1.I en array finns ett personnummer. Skapa ett program som kontrollerar att
    //födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett
    //felmeddelande om så ej är fallet.

    public static void main(String[] args) {
        //19990101-1234

        char[] pnr = {'1', '9', '9', '9', '0', '1', '0', '1', '-', '1', '2', '4', '4'};
        char[] pnr2 = new char[13];
        pnr2[0] = '1';
        System.out.println(pnr2);  // här får vi bara ut första indexvärdet. De övriga är inte satta. Det blir default.

        System.out.println(pnr);
        if(pnr[8] != '-') System.out.println("Bindestreck saknas");


 //2.Om den näst sista siffran är jämn i personnumret är det en kvinna, om den är ojämn är
        //det en man. Avgör om personen i föregående uppgift är man eller kvinna.

        if (pnr[11] % 2 == 0) System.out.println("kvinna");
        if (pnr[pnr.length-2] % 2 == 1) System.out.println("man");

 //3.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.

        long [] numbers = new long[50];
        numbers[0] = 1;
        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[0]*2;
            numbers[0] = numbers[i];
            //System.out.println("index " + i + " är "+ numbers[i]);
        }

        System.out.println();
//4.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
        //arrayn

        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] % 2==0 ) {
                numbers[i]+=2;
            }
            System.out.println(i + " " +numbers[i]);
        }

 //5.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är jämna.

        int ifPositive = 0;
        for (int i = 0; i <numbers.length; i ++) {
            if(numbers[i]%2==0) ifPositive++;
        }
        System.out.println(ifPositive + " tal är jämna");
    }



}
