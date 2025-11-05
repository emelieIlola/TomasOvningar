package ovningVecka3;
//
//Konstruktorn ska ta in ett namn och ett pris.
//Skapa en metod applyDiscount som tar in en procent
// och sänker priset med den procentsatsen.
//Skapa ett Item-objekt i main, applicera en
// rabatt och visa det nya priset.
//
public class Item {
    String namn;
    double pris;

    public Item(String namn, double pris){
        this.namn = namn;
        this.pris = pris;
    }
    public boolean discount(int procent){
        double nyttPris = pris*(100-procent)/100;
        pris = nyttPris;
        return true;
    }
    public void getprisInfo(double pris) {
        System.out.println("Pris: " + pris);
    }



}
