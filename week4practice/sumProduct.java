import java.util.Scanner;

public class SumProduct {

    static void calculate(int a, int b) {
        int sum = a + b;
        int product = a * b;

        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        calculate(num1, num2);
    }
}
