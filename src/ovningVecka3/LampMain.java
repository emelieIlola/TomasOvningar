package ovningVecka3;

public class LampMain {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp(false);

        System.out.println("Lampans status är: " + myLamp.isOn());
        if(myLamp.lampOn()) System.out.println("Lampan är på");
        else System.out.println("Det gick inte att tända lampan.");
        System.out.println("lampans status är: " + myLamp.isOn());

        if(myLamp.lampOff()) System.out.println("Lampan är släckt!");
        else System.out.println("Det gick ej att släcka lampan.");
        System.out.println("Lampans status är: " + myLamp.isOn());

    }
}
