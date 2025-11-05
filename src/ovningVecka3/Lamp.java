package ovningVecka3;
//Skapa en klass Lamp:
//Konstruktorn ska ta in ett boolean-attribut isOn.
//Skapa metoder turnOn och turnOff för att slå på och av lampan.
//Skapa ett Lamp-objekt i main och växla mellan på och av.

public class Lamp {
   boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean lampOn() {
            isOn = true;
            return true;
    }
    public boolean lampOff(){
            isOn = false;
            return true;

    }
    public boolean isOn(){
        return isOn;
    }

}
