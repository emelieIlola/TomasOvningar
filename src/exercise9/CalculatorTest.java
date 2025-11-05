package exercise9;

public class CalculatorTest {

    private int first, second;  //attribut

    public CalculatorTest(int first, int second){ // konstruktorn

        this.first = first;
        this.second = second;
    }
    public int add() {
        return first + second;
    }
}
