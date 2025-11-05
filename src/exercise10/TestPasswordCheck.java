package exercise10;

import exercise9.CalculatorTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCorrectPassword() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("pass§word1");

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testAtLeast1Digit() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoDigits() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass#word");

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testlLessThan8CharactersAndNoDigits() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass4word");

        //Assert
        assertEquals(expected, actual);
    }
}
