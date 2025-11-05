package ovningVecka3;

public class CircleMain {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(10);
        System.out.println("The area is. " + circle1.calculateArea());
        System.out.println("The circumference is: " + circle1.calculateCircumference());

      //  if (circle1.calculateArea()> circle2.calculateArea())
        if (circle1.isBiggerThan(circle2)){
            System.out.println("Circle 1 is ibgger than Circle 2");
        } else {
            System.out.println("Circle 1 is smaller than Circle 2");
        }


    }

}
