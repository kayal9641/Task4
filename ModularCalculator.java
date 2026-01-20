import java.util.Scanner;

/**
 * Modular Calculator Program
 * Takes input from user and performs operations using methods
 */
public class ModularCalculator {

    // Addition (method overloading)
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division with exception handling
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Utility method
    public static void displayResult(String operation, double result) {
        System.out.println(operation + " Result: " + result);
    }

    // Pass-by-value demonstration
    public static void passByValueExample(int value) {
        value = value + 10;
        System.out.println("Inside method value: " + value);
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    displayResult("Addition", add(a, b));
                    break;
                case 2:
                    displayResult("Subtraction", subtract(a, b));
                    break;
                case 3:
                    displayResult("Multiplication", multiply(a, b));
                    break;
                case 4:
                    displayResult("Division", divide(a, b));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Pass-by-value demonstration
        int value = 20;
        passByValueExample(value);
        System.out.println("Outside method value: " + value);

        scanner.close();
    }
}
