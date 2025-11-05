package ovningVecka4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordCheck {

    @Test
    public void TestCorrectPassword() {
        //arrang
        PasswordCheckk passw = new PasswordCheckk();
        boolean expected = true;
        //act
        boolean acctual = passw.check("passw#ord1");
        //asert
        assertEquals(expected, acctual);
    }

    @Test
    public void testLessThan8Charackters() {
        PasswordCheckk passw = new PasswordCheckk();
        boolean expected = false;

        boolean actual = passw.check("pass1");

        assertEquals(expected, actual);
    }
    @Test
    public void testLessThan8CharacktersAndNoDigits() {
        PasswordCheckk passw = new PasswordCheckk();
        boolean expected = false;

        boolean actual = passw.check("pass");

        assertEquals(expected, actual);
    }

    @Test
   public void testNoDigit() {
        PasswordCheckk passw = new PasswordCheckk();
        boolean expected = false;

        boolean acctual = passw.check("pas#sword");
        assertEquals(expected, acctual);
    }


    @Test
    public void testNoSpecialCharacters() {
        PasswordCheckk passw = new PasswordCheckk();
        boolean expected = false;

        boolean acctual = passw.check("password4d");
        assertEquals(expected, acctual);
    }
}
