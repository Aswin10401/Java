import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user for the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
                break;
        }

        // Display the result
        if (validOperation) {
            System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);
        }

        scanner.close();
    }
}
