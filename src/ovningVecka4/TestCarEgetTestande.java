package ovningVecka4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarEgetTestande {

    @Test
    void getCarBrand(){
        CarEgetTestande myCar = new CarEgetTestande("Kia", 55);
        myCar.setCarBrand("KIA");
        assertEquals("KIA", myCar.getCarBrand());
    }

    @Test
    void getSpeed(){
        CarEgetTestande myCar = new CarEgetTestande("Kia", 55);
        myCar.setSpeed(30);
        assertEquals(30, myCar.getSpeed());
    }

    @Test
    void SpeedExact0 (){
        CarEgetTestande myCar = new CarEgetTestande("Kia", 55);
        myCar.setSpeed(0);
        assertEquals(0,myCar.getSpeed());
    }


    @Test
    void SpeedLowerThan0 (){
        CarEgetTestande myCar = new CarEgetTestande("Kia", 55);
        myCar.setSpeed(-10);
        assertEquals(55,myCar.getSpeed());
    }


}
