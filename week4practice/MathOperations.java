import java.util.Scanner;

public class MathOperations {

    static void performOperations(int a, int b) {
        int sum = a + b;
        int product = a * b;

        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);

        if (product != 0) {
            double division = (double) sum / product;  
            System.out.println("Division (sum/product): " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        performOperations(num1, num2);
    }
}
