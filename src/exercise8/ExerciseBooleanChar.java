package exercise8;

public class ExerciseBooleanChar {

        //Skapa en metod som heter isLetter(char sign) som kontrollerar om ett tecken (sign) är en engelsk bokstav (a-z)
        // Denna metod returnerar true om tecknet är en engelsk bokstav annars false
        public static void main(String[] args) {

            SpellChecker spell = new SpellChecker(); //skapar ett objekt

            if (spell.isLetter('h')) {
                System.out.println("h is a letter");
            }
            if (spell.isLetter('a')) {
                System.out.println("a is a letter");
            }
            if (spell.isLetter('z')) {
                System.out.println("z is a letter");
            }
            if (spell.isLetter('å')) {
                System.out.println("å is a letter");
            }
            if (spell.isLetter('A')) {
                System.out.println("A is a letter");
            }
            if (spell.isLetter('Z')) {
                System.out.println("Z is a letter");
            }

        }
}
