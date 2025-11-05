package ovningVecka3;
//Skapa en klass WeatherReport:
//Konstruktorn ska ta in temperatur och beskrivning (t.ex. "soligt", "regnigt").
//Skapa en metod getDescription som returnerar en beskrivning av vädret.
//Skapa ett WeatherReport-objekt i main och skriv ut väderbeskrivningen.


public class WeatherReport {
    int temperature;
    String description;

    public WeatherReport(int temperature, String description){
        this.temperature = temperature;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String newDescription) {
        description = newDescription;
        return description;
    }
}
