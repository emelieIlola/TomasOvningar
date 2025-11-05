package ovningVecka3;

public class Rectangle {
    private int bredd, hojd; //attribut

    //konstruktor med inparametrar
    public Rectangle(int bredd, int hojd) {
        this.bredd = bredd;
        this.hojd = hojd;
    }
    // Skapa en metod calculateArea som returnerar rektangelns area.
    public int calculateArea(int bredd, int hojd) {
        return bredd * hojd;
    }
   // Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.
    public int calculatePerimeter(int bredd, int hojd) {
        return 2*bredd + 2*hojd;
    }
   //Lägg till en metod isSquare som returnerar om rektangeln är en kvadrat (där bredd och höjd är lika).
    public boolean isSquare(int bredd, int hojd) {
        if (bredd == hojd) {
            return true;
        }
        return false;

    }

}
