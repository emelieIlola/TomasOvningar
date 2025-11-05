package tdd.user;

//ramverk
//Junit5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    //--------------------------------test userName--------------------------
    @Test
    void testOfUser() {
        User myUser = new User("Tomas", "qwerty1");
    }

    @Test
    void testSetUserNameTo5Chars() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setUserName("Tomas");
        assertEquals("Tomas", myUser.getUserName());
    }

    @Test
    void testSetUserNameTo3Chars() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setUserName("Asa");
        assertEquals("Gunnar", myUser.getUserName());
    }

    //Skriv ett test/kod som kontrollerar att userName inte får vara kortare än 4 tecken,
    // i så fall behåller man det ursprungliga userName
    @Test
    void testSetUserNameTo4Chars() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setUserName("Olle");
        assertEquals("Olle", myUser.getUserName());
    }

    //   -----------------------test password ---------------------------------------

    //Skriv test som gör det möjligt att uppdatera lösenordet.
    // Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt

    @Test
    void testcorrectPasswordLength7to20Char() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setPassword(("Sommar1234"));
        assertEquals("Sommar1234", myUser.getPassword());
    }

    @Test
    void testpasswordShorterThan7Chars() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setPassword("lösen");
        assertEquals("qwerty1", myUser.getPassword());
    }

    @Test
    void passwordLongerThan20Chars() {
        User myUser = new User("Gunnar", "qwerty1");
        myUser.setPassword("hejsansvejsanpådigsan1234");
        assertEquals("qwerty1", myUser.getPassword());
    }

    //Lösenordet måste innehålla minst en av dessa tecken: !$#&
    //       (Tips: det finns fler metoder i String)
    @Test
    void testNoSpecialCharacterInPassword() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = false;
        boolean acctual = myUser.checkPassword("hejsansvejsanpådigsan1234");
        assertEquals(expected, acctual);
    }

    @Test
    void testAtLeastOneSpecialCharacterInPassword() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = true;
        boolean acctual = myUser.checkPassword("hejsanSvejsanpådigsan1234!");
        assertEquals(expected, acctual);
    }
    // Lösenordet måste ha minst en liten och en stor bokstav (a-z, A-Z

    @Test
    void testPasswordNoCapital() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = false;
        boolean acctual = myUser.checkPassword("hejsansv&ejsanpådigsan1234");
        assertEquals(expected, acctual);
    }

    @Test
    void testPasswordAtLeastOneCapital() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = true;
        boolean acctual = myUser.checkPassword("hejsanSv&ejsanpådigsan1234");
        assertEquals(expected, acctual);
    }

    @Test
    void testPasswordOnlyCapital() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = false;
        boolean acctual = myUser.checkPassword("HE!JSANSVEJSAN&1234");
        assertEquals(expected, acctual);
    }

    @Test
    void testPasswordAtLeastOneLowerCase() {
        User myUser = new User("Gunnar", "qwerty1");
        boolean expected = true;
        boolean acctual = myUser.checkPassword("HE!JSANsVEJSAN&1234");
        assertEquals(expected, acctual);
    }

    //--------------------------------test typeOfUser-----------------------------------

    //En användare börjar alltid typeOfUser som en ”normal” user.
    // Skriv test som hämtar detta attribut
    @Test
    void testOfTypeOfUserToNormal() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("normal");
        assertEquals("normal", myUser.getTypOfUser());
    }

    //Det går att ändra typeOfUser genom en metod
    @Test
    void testUpdateTypeOfUserToSuper() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("super");
        assertEquals("super", myUser.getTypOfUser());
    }

    @Test
    void testUpdateTypeOfUserToAdmin() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("admin");
        assertEquals("admin", myUser.getTypOfUser());
    }

    @Test
    void testUpdateTypeOfUserToANonCorrectTypOfUser() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("new");
        assertEquals("normal", myUser.getTypOfUser());
    }

    @Test
    void testUpdateTypeOfUserWithGoldMember() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("gold member");
        assertEquals("gold member", myUser.getTypOfUser());
    }

    @Test
    void testNumberOfInlogg() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setNumberOfInlogg(9);
        assertEquals(9, myUser.getNumberOfInlogg());
    }

    @Test
    void test20InloggAtomaticlySetsTypeOfUserToGoldMember() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setNumberOfInlogg(21);
        assertEquals("gold member", myUser.getTypOfUser());
    }

    @Test
    void testThatWhenTypeOfUserUpdatesToGoldSolidiusGrow20() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypOfUser("gold member");
        assertEquals(25, myUser.getSolidus());

    }

 //   ----------------------------e-mail-----------------------

    // En user kan lägga till email + man kan kolla upp vad en user har för mail.



    // En user kan ha upp till 4 email sparade.

    @Test
    void testThatSetsAndGets4EmailToArray() {
        User myUser = new User("", "");
        String[] emails ={
                "hejsan@test.com",
                "dumle@test.com",
                "s@test.com",
                "c@test.com"
                };

        myUser.setEmail(emails);
        String[] actualEmails = myUser.getEmail();

        assertArrayEquals(emails, actualEmails);
    }

    @Test
    void testThatSetsAndGets1EmailFromArray() {
        User myUser = new User("", "");
        String[] emails ={
                "hejsan@test.com",
                "dumle@test.com",
                "s@test.com",
                "c@test.com"
        };
        myUser.setEmail(emails);
        String[] actualEmails = myUser.getEmail();

        assertEquals("hejsan@test.com", actualEmails[0]);
    }

//Om fler än 4 epostadresser försöker läggas till
//    ersätts den första med den som försöker läggas till.

    @Test
    void testThatThatFirstEmailUpdatesWhenMoreThanFourEmails() {
        User myUser = new User("", "");
        String[] emails ={
                "hejsan@test.com",
                "dumle@test.com",
                "s@test.com",
                "c@test.com",
                "apa@test.com",
                "h@test.se",
                "m@test.se"
                 };
        myUser.setEmail(emails);
        String[] actualEmails = myUser.getEmail();

        assertEquals("m@test.se", actualEmails[0]);
    }

  /*  @Test //Ej färdig??
    void testThatEmailContainAtSign(){
    User myUser = new User("", "");
    String[] emails ={
            "hejsantest.com",
            "dumletest.com",
            "stest.com",
            "ctest.com",
            "apatest.com",
            "htest.se",
            "m@test.se"
    };


    boolean hasValidEmail = myUser.checkEmail(emails);
    assertTrue(hasValidEmail);  //KONTROLLERAR ATT MINST EN GILTIGEPOST FINNS

        String[] expectedEmails = {"m@test.se"};
    assertArrayEquals(expectedEmails, myUser.getEmail());

}
   */

// 5. En user kan inte lägga till en email som redan är registrerad.


// 6. En user kan ta bort en email.


    // 7. en ser kan fråga hur många email de har lagrade.


    @Test
    void testOfSolidus(){
        User myUser = new User("Gunnar", "qwerty");
        assertEquals(5, myUser.getSolidus());
    }

    @Test
    void
    testOfLoggaIn(){
        User myUser = new User("Gunnar", "qwerty");
        myUser.loggaIn("Gunnar", "qwerty");
        assertEquals(6, myUser.getSolidus());
    }

    @Test
    void testOfFailingLoggaIn(){
        User myUser = new User("Gunnar", "qwerty");
        assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
        assertEquals(6, myUser.getSolidus());
    }
/*
    @Test
    void testOfFailingLoggaIn1(){
        User myUser = new User("Gunnar", "qwerty");
        assertFalse(myUser.loggaIn("Gunnar", "qwerty"));
        assertEquals(5, myUser.getSolidus());
    }
*/
    @Test
    void testOfGoldMember() {
        User myUser = new User("Gunnar", "qwerty");
        for (int index = 1; index < 20; index++) {
            assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
            assertEquals(5 + index, myUser.getSolidus());
        }
        assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
        assertEquals(45, myUser.getSolidus());
        assertEquals("gold member", myUser.getTypOfUser());
    }
    @Test
    void testOfBuyTshirt(){
        User myUser = new User("Gunnar", "qwerty");
        myUser.setSolidus(15);
        assertTrue(myUser.tShirt());
    }
    @Test
    void testOfFailingBuyTshirt(){
        User myUser = new User("Gunnar", "qwerty");
        myUser.setSolidus(15);
        assertTrue(myUser.tShirt());
    }

}



