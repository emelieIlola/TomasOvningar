package ovningVecka3;

public class Circle {
    int radie;

    public Circle(int radie) {
        this.radie = radie;
    }

    public double calculateArea() {
        return radie * radie * Math.PI;
    }

    public double calculateCircumference() {
        return radie * 2 * Math.PI;
    }

    //Utöka Circle. Lägg till en metod isBiggerThan som
    //tar in en annan Circle och returnerar om den aktuella
    // cirkeln har större area än den andra cirkeln.
    public boolean isBiggerThan (Circle other){
        if (this.calculateArea() > other.calculateArea()) {
            return true;
        } else {
            return false;
        }
    }
}
