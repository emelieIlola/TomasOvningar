package ovningVecka4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmailAccount {

    //Skapa tester för en EmailAccount med attribut email och password.
    //email måste innehålla @.
    //password måste vara minst 8 tecken långt.
    //Skriv tester för giltiga/ogiltiga värden.
    //Lägg till en metod changePassword(oldPass, newPass) som bara ändrar lösenordet om det gamla stämmer och det nya är giltigt.

    @Test
    void testCreateEmail(){
       // Arange
        EmailAccount emailAccount = new EmailAccount("", "");

        //act
        emailAccount.setEmail("emelie.ilola@outlook.com");

        //assert
        assertEquals("emelie.ilola@outlook.com", emailAccount.getEmail());
    }
}
