package ovningVecka5;

import java.util.Arrays;

public class ArrayOvningar {

    public static void main(String[] args) {


        int[] nbrArrRandom = new int[50];
        for (int i = 0; i < nbrArrRandom.length; i++) {
            nbrArrRandom[i] = (int) ((Math.random() - 0.5) * 200);
        }
        for (int i = 0; i < nbrArrRandom.length; i++) {
            //System.out.println(nbrArrRandom[i]);
        }
        System.out.println();

        System.out.println("Uppgift 4: ");
//4.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
        //arrayn

        for (int i = 0; i < nbrArrRandom.length; i++) {
            if (i % 2 == 0) {
                nbrArrRandom[i] += 2;
                System.out.print(i + " " + nbrArrRandom[i]);
            }
        }

        System.out.println();

        System.out.println("Uppgift 5: ");
//5.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.

        int ifPositive = 0;
        for (int i = 0; i < nbrArrRandom.length; i++) {
            if (nbrArrRandom[i] >= 0) {
                ifPositive++;
                //System.out.println("talet är positivt " + nbrArrRandom[i]);
            }
        }
        System.out.println(ifPositive + " tal är positiva");
        System.out.println();


        //       for (int number: nbrArrRandom){
        //           System.out.println(number);
        //      }
        //     System.out.println();


        System.out.println("Uppgift 6: ");
// 6. ta reda på och skriv ut hur många tal som är större än det första talet.

        System.out.println("Första numret är: " + nbrArrRandom[0]);
        int isbiggerThanTheFirstNumber = 0;
        for (int i = 0; i < nbrArrRandom.length; i++) {
            if (nbrArrRandom[i] > nbrArrRandom[0]) {
                isbiggerThanTheFirstNumber++;
                // System.out.println(nbrArrRandom[i] + "... Talet är större än första numret. ");
            }
        }
        System.out.println(isbiggerThanTheFirstNumber + " tal är större än det första numret.");



        System.out.println();
        System.out.println("Uppgift 7:");
// 7. Bestäm och skriv ut index för det sista negativa talet i arrayn. (tips börja bakifrån)
//(int i = 49; i < nbrArrRandom.length; i--)
        for (int i = nbrArrRandom.length-1; i>=0 ; i--){  //
            if (nbrArrRandom[i] < 0) {
                System.out.println(nbrArrRandom[i] + ", på index: " + i + " är det sista negativa talet i arrayen.");
                break;
            }
        }
        System.out.println();



        System.out.println("Uppgift 8: ");
// 8. Beräkna och skriv ut summan och medelvärdet av de 50 talen.
        int summan = 0;

        for (int i = 0; i < nbrArrRandom.length; i++) {
            summan += nbrArrRandom[i];
        }

        int medelvärdet = summan/nbrArrRandom.length;

        System.out.println("summan är: " + summan + " och medelvärdet är: " + medelvärdet);
        System.out.println();



        System.out.println("Uppgift 9: ");
// 9. Leta upp det största och det minsta talet i arrayn och skriv ut dem.

        int isBiggest = nbrArrRandom[0];
        int isSmallest = nbrArrRandom[0];
        for (int i = 0; i < nbrArrRandom.length; i++) {
            if (nbrArrRandom[i] > isBiggest) {
                isBiggest = nbrArrRandom[i];
            }
            if (nbrArrRandom[i] < isSmallest){
                isSmallest = nbrArrRandom[i];
            }
        }
        System.out.println(isBiggest + " är största numret & " + isSmallest + " är det minsta numret.");

        System.out.println("Tomas lösning på uppgift 9: ");
        int max =0, min = 0;
        for (int nbr: nbrArrRandom){
            if(nbr>max) max=nbr;
            if (nbr<min) min = nbr;
        }
        System.out.println(Arrays.toString(nbrArrRandom));  //skriver ut hela nbrArrRandom-arrayen.
        System.out.println(max);
        System.out.println(min);


        System.out.println();
        System.out.println("Uppgift 10");
//10. Beräkna och skriv ut summan av alla positiva tal och summan av alla negativa tal i arrayn.
        int summanAvPositivaTalen = 0;
        int summanAvDeNegativaTalen = 0;
        for (int i = 0; i < nbrArrRandom.length; i++) {
            if (nbrArrRandom[i] > 0 ) {
                summanAvPositivaTalen += nbrArrRandom[i];
            }
            if (nbrArrRandom[i]< 0 ){
                summanAvDeNegativaTalen += nbrArrRandom[i];
            }
        }
        System.out.println("Summan av de positiva talen är " + summanAvPositivaTalen);
        System.out.println("Summan av de negativa talen är " + summanAvDeNegativaTalen);




        System.out.println();
        System.out.println("Uppgift 11: ");

//11.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning

        int[] talArray = {10, 32, -3, 9, -49, 82, 16, 7, -1, 55 };
        int[] talOmvandArray = new int[talArray.length];

        for(int i = 0; i<talArray.length; i++){
            talOmvandArray[talArray.length-1-i] = talArray[i];
        }
        System.out.println(Arrays.toString(talArray));
        System.out.println(Arrays.toString(talOmvandArray));


        System.out.println();
        System.out.println("Uppgift 12: ");

//12.Skapa ett program som läser in 10 heltal till en array och sedan skriver ut talen
//baklänges. Endast en array ska användas.

        int[] randomArrayUppgift12 = new int[10];
        // define the range
        int min12 = 1;
        int max12 = 100;
        int range = max12 - min12 + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min12;
            //System.out.print(rand + " ");
            randomArrayUppgift12[i] = rand;
        }
        System.out.println(Arrays.toString(randomArrayUppgift12));
        for (int i= randomArrayUppgift12.length-1; i>-1; i--){
            System.out.print(randomArrayUppgift12[i] + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("Uppgift 13: ");
//13.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array
//med två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande
//skrivas ut om så är fallet.
 //14.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Det är
//inte vanligt att man låter nämnaren vara negativ. Om så är fallet ska bråket ändras så att
//nämnaren blir positiv.

        int[] bråk = new int[2];
        int täljare = bråk[0];
        int nämnare = bråk[1];
        // define the range

        for (int i = 0; i < bråk.length; i++) {
            int rand = (int) (Math.random() * range) + min;
            //System.out.print(rand + " ");
            if(rand ==1 || rand ==0) {
                System.out.println("Felaktiga värden");
            } else if (i==0) {
                täljare = rand;
                System.out.println(täljare);
            } else if (i==1){
                if (rand <0) {

                }
            }

        }
        double bråktal = täljare/nämnare;
        System.out.println("En beräkning om bråk[0] är täljare och bråk[1] är nämnare. Bråktalsberäkningen = " + bråktal);


        System.out.println();
        System.out.println("Uppgift 14: ");


    }

}