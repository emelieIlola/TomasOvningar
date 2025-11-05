package ovningVecka3;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(1,2);
        //System.out.println(myRectangle.calculateArea());

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in bredd");
        int bredd = scan.nextInt();
        System.out.println("skriv in hojd");
        int hojd = scan.nextInt();


        System.out.println("The area is: " + myRectangle.calculateArea(bredd, hojd));
        System.out.println("The peremiter is: " + myRectangle.calculatePerimeter(bredd, hojd));
        if (myRectangle.isSquare(bredd, hojd)) {
            System.out.println("This is a square");
        } else if (!myRectangle.isSquare(bredd, hojd)){
            System.out.println("This is a rectangle.");
        }


        //System.out.println(myRectangle.isSquare(5,10));

    }


}
