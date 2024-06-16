import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + fact(num));

    }
}