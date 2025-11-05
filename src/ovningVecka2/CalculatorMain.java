package ovningVecka2;

import java.util.Scanner;
public class CalculatorMain {

    public static void main(String[] args) {

       //input
        Scanner scan = new Scanner(System.in);
        System.out.print("skriv in tal1: ");
        int tal1 = scan.nextInt();
        System.out.print("Skriv in tal2: ");
        int tal2 = scan.nextInt();

        //output
        Calculator calc = new Calculator(tal1, tal2);
        int summa = calc.addition();
        System.out.println("Vid addition "+summa);
        int subtraktion = calc.minus();
        System.out.println("Vid subtration " + subtraktion);
        double division = calc.delat();
        System.out.println("Vid division " + division);
        //int multiplicering = calc.ganger();
        System.out.println("Vid multiplikation " + calc.multiplikation());

        System.out.println("info om calculator 2");
        Calculator calc2 = new Calculator(summa,calc.multiplikation());
        System.out.println("Vid addition "+calc2.addition());
       // int subtraktion = calc.minus();
        System.out.println("Vid subtration " + calc2.minus());
      //  double division = calc.delat();
        System.out.println("Vid division " + calc2.delat());
        //int multiplicering = calc.ganger();
        System.out.println("Vid multiplikation " + calc2.multiplikation());

    }
}
