import java.util.Scanner;

public class Number {
    private double value;
    public Number(double value) {
        this.value = value;
    }
    public boolean isZero() {
        return value == 0;
    }
    public boolean isPositive() {
        return value > 0;
    }
    public boolean isNegative() {
        return value < 0;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return value % 2 != 0;
    }
    public double getFactorial() {
        if (value < 0 || value != (int) value) {
            System.out.println("Factorial is only defined for non-negative integers.");
        }
        double result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double inputValue = scanner.nextDouble();

        Number number = new Number(inputValue);
        number.isZero();
        System.out.println("");
        System.out.println("The number zero: " + number.isZero());
        System.out.println("The number positive: " + number.isPositive());
        System.out.println("The number negative: " + number.isNegative());
        System.out.println("The number even: " + number.isEven());
        System.out.println("The number odd: " + number.isOdd());
        try {
            System.out.println("Factorial of the number: " + number.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
