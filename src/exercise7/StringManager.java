package exercise7;

public class StringManager {

    public static void main(String[] args) {
    //                     012345678  (index)
        String myString = "some text";

        if (myString.equals("some text")) {
            System.out.println("yes the text is the same!");
        }


        if(myString.length() == 9) {
            System.out.println("the text is exacly 9 characters");
        }

        System.out.println(myString.charAt(myString.length()-1));
    }
}
