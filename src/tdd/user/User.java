package tdd.user;

import java.util.Arrays;
import java.util.Objects;

public class User {
    String[] emails;
    String userName, password, typOfUser = "normal";
    private int solidus = 5;
    int numberOfInlogg = 0;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        // this.typOfUser = typOfUser;    //eftersom attributet typOfUser finns med som startvärde i classen så räcker det.
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length() >= 4) this.userName = userName;
    }

    public void setPassword(String password) {
        if ((password.length() >= 7 && (password.length() <= 20))) this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setTypOfUser(String typOfUser) {
        if (typOfUser.equals("normal") ||
                typOfUser.equals("admin") ||
                typOfUser.equals("super") ||
                typOfUser.equals("gold member")) this.typOfUser = typOfUser;
        if (typOfUser.equals("gold member")) solidus += 20;
    }

    public String getTypOfUser() {
        return typOfUser;
    }

    public boolean checkPassword(String password) {
        boolean hasSpecialCharacter = false;
        boolean hasUperCaseCharacter = false;
        boolean hasLowerCasecharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == '!' || c == '$' || c == '#' || c == '&') {
                hasSpecialCharacter = true;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUperCaseCharacter = true;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerCasecharacter = true;
            }
        }
        return hasSpecialCharacter && hasUperCaseCharacter && hasLowerCasecharacter;
    }

    public int getNumberOfInlogg() {
        return numberOfInlogg;
    }

    public void setNumberOfInlogg(int setNumberOfInlog) {
        numberOfInlogg += setNumberOfInlog;
        if (numberOfInlogg >= 20) typOfUser = "gold member";
        solidus = +20;
    }

    public int getSolidus() {
        return solidus;
    }


    public String[] getEmail() {
        return emails;
    }

    public void setEmail(String[] emails) {
        if (emails.length > 4) {
            emails[0] = emails[emails.length - 1];
        }
        this.emails = emails;
    }

    public boolean checkEmail(String[] emails) {
        boolean emailContainAtSign = false;
        int count = 0;

        for (String mail : emails) {
            if (mail.contains("@")) {
                count++;
            }
        }

        if (count == 0) {
            this.emails = new String[0];
            return false;
        }
        this.emails = new String[count];
        int index = 0;
        for (String mail : emails) {
            if (mail.contains("@")) {
                this.emails[index] = mail;
            }
        }
        return emailContainAtSign;
    }

    public boolean loggaIn(String usr, String pswd) {
        if (usr.equals(this.userName) && pswd.equals(this.password)) {
            this.solidus++;
            numberOfInlogg++;
            if (numberOfInlogg == 20) {
                this.solidus += 20;
                this.typOfUser="gold member";
            }
            return true;
        }
        return false;
    }

    public void setSolidus(int solidus) {
        this.solidus = solidus;
    }

    public boolean tShirt() {
        if(this.solidus>=15){
            this.solidus -=  15;
            return true;
        }
        return false;
    }
}

//        this.email = Arrays.copyOf(mail,mail.length);


