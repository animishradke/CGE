
interface SquareCalculator {
    int calculateSquare(int number);

    default void printResult(int number) {
        System.out.println("The square of " + number + " is: " + calculateSquare(number));
    }
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        SquareCalculator squareCalculator = (number) -> number * number;

        int number = 4;
        squareCalculator.printResult(number);
    }
}
