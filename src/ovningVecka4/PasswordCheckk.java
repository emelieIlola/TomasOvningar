package ovningVecka4;

public class PasswordCheckk {

    public boolean check(String password) {

        boolean enoughCaracters = false;
        boolean hasDigits = false;
        boolean hasSpecialCharacters = false;

        if (password.length() >= 8) {
            enoughCaracters = true;
        }
        for(int i=0; i<password.length();i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;
            }
            if (!Character.isLetterOrDigit(c)){
                hasSpecialCharacters = true;
            }
        }
        return enoughCaracters && hasDigits && hasSpecialCharacters;

    }
}