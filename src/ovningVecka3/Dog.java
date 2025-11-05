package ovningVecka3;
//Konstruktorn ska ta in namnet och rasen på hunden.
// Skapa en metod bark som skriver ut ”Voff!".
// Skapa ett Dog-objekt i main och låt det skälla.
public class Dog {
    String namn;
    String ras;
    int age;

    public Dog(String namn, String ras, int age){
        this.namn = namn;
        this.ras = ras;
        this.age = age;
    }

    public void Bark(){
        System.out.println("Voff");
    }
    public int GrowAge(int antalAr) {
        age += antalAr;
        return age;
    }
    public void getHumanAge(int dogAge) {
       int humanAge = dogAge *7;
       System.out.println(namn + "ålder i människoår är: " + humanAge);
    }

}
