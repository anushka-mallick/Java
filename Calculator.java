import java.util.Scanner;

public class Calculator {
    private static int num1, num2;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input();
        int result = calculator.add(num1, num2);
        System.out.printf("The sum of %d and %d is %d.", num1, num2, result);
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    // TODO write methods to subtract, multiply and divide

    private void input() {
        System.out.println("Enter 2 numbers");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Number 1: ");
            num1 = scanner.nextInt();
            System.out.print("Number 2: ");
            num2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}