package ovningVecka4;

public class EmailAccount {
    String email, password;

    public EmailAccount(String email, String password){
        this.email = email;
        this.password = password;
    }


    public void setEmail(String mail) {
        email = mail;
    }

    public String getEmail() {
        return email;
    }
}
