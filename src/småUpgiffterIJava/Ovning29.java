package småUpgiffterIJava;

public class Ovning29 {

  /*  29.Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
    följande: tidpunkt i timma och minut för avgången (t ex 12:41) körtid i timma och minut (t
    ex 3:47) I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt
    passeras ska det även skrivas “NÄSTA DAG“ i utmatningsrutan.

   */

    public static void main(String[] args) {
        int avgangTimme = 23;
        int avgangMinut = 10;
        int kortidTimme = 28;
        int kortidmiminut = 47;
        int ankomstTimme = avgangTimme + kortidTimme;
        int ankomstMinut = avgangMinut + kortidmiminut;


        if (ankomstMinut > 60) {
            ankomstTimme++;
            //System.out.println(ankomstTimme);
            ankomstMinut -= 60;
            //System.out.println(ankomstMinut);
            if (ankomstTimme > 24) {
                ankomstTimme -= 24;
                System.out.println("Nästa dag " + ankomstTimme + ":" + ankomstMinut);
            }
        } else if (ankomstTimme>24) {
            ankomstTimme -=24;
            System.out.println("Nästa dag " + ankomstTimme + ":" + ankomstMinut);
        } else {
            System.out.println(ankomstTimme + ":" + ankomstMinut);
        }
    }
}