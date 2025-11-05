package exercise9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExercise {

    @Test
    public void firstTestCase() {
        String text = "some text";
        int actual = text.length();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void add() {

        //Arrange
        CalculatorTest calc = new CalculatorTest(2, 3);
        int expected = 5;

        //Act
        int actual = 6;

        //Assert
        assertEquals(expected, actual);
    }
}
