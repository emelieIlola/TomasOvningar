package ovningVecka4;

public class CarEgetTestande {
        String brand;
        int speed;

    public CarEgetTestande (String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getCarBrand() {
        return brand;
    }

    public void setCarBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
