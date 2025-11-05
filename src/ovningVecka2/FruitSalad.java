package ovningVecka2;

import java.util.Scanner;

public class FruitSalad {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String color = scan1.nextLine();
        Fruit apple = new Fruit(color);
        System.out.println("ditt äpple är " + apple.getColor());

    }
}
